package com.jonadab.cloudapi.repository;

import com.jonadab.cloudapi.model.FileRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRecordRepository extends JpaRepository<FileRecord, Long> {
}
