package com.jonadab.cloudapi.service;

import com.jonadab.cloudapi.model.FileRecord;
import com.jonadab.cloudapi.repository.FileRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FileRecordService {

    private final FileRecordRepository repository;

    public FileRecordService(FileRecordRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public FileRecord createFile(FileRecord fileRecord) {
        return repository.save(fileRecord);
    }

    // READ ALL
    public List<FileRecord> getAllFiles() {
        return repository.findAll();
    }

    // READ BY ID
    public Optional<FileRecord> getFileById(Long id) {
        return repository.findById(id);
    }

    // DELETE
    public void deleteFile(Long id) {
        repository.deleteById(id);
    }
}
