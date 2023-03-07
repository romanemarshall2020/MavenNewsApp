package com.rome.mavennewsapp.repository;

import com.rome.mavennewsapp.model.Source;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SourceRepo extends JpaRepository<Source, Long>, JpaSpecificationExecutor<Source> {
}
