package com.jonadab.cloudapi.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class FileRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private long fileSize;
    private String fileType;
    private LocalDateTime uploadTime;

    public FileRecord() {
    }

    public FileRecord(String fileName, long fileSize, String fileType) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.uploadTime = LocalDateTime.now();
    }

    public Long getId() { return id; }

    public String getFileName() { return fileName; }

    public void setFileName(String fileName) { this.fileName = fileName; }

    public long getFileSize() { return fileSize; }

    public void setFileSize(long fileSize) { this.fileSize = fileSize; }

    public String getFileType() { return fileType; }

    public void setFileType(String fileType) { this.fileType = fileType; }

    public LocalDateTime getUploadTime() { return uploadTime; }

    public void setUploadTime(LocalDateTime uploadTime) { this.uploadTime = uploadTime; }
}
