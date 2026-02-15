package com.jonadab.cloudapi.controller;

import com.jonadab.cloudapi.model.FileRecord;
import com.jonadab.cloudapi.service.FileRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileRecordController {

    private final FileRecordService service;

    public FileRecordController(FileRecordService service) {
        this.service = service;
    }

    // CREATE (POST)
    @PostMapping
    public FileRecord create(@RequestBody FileRecord fileRecord) {
        return service.createFile(fileRecord);
    }

    // READ ALL (GET)
    @GetMapping
    public List<FileRecord> getAll() {
        return service.getAllFiles();
    }

    // READ ONE (GET by id)
    @GetMapping("/{id}")
    public ResponseEntity<FileRecord> getById(@PathVariable Long id) {
        return service.getFileById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE (DELETE by id)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (service.getFileById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteFile(id);
        return ResponseEntity.noContent().build();
    }
    // UPDATE (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<FileRecord> update(@PathVariable Long id, @RequestBody FileRecord updatedRecord) {

        return service.getFileById(id)
                .map(existing -> {
                    existing.setFileName(updatedRecord.getFileName());
                    existing.setFileSize(updatedRecord.getFileSize());
                    existing.setFileType(updatedRecord.getFileType());
                    return ResponseEntity.ok(service.createFile(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

}
