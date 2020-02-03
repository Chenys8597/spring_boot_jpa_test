package com.example.spring_boot_jpa_test.dao;

import com.example.spring_boot_jpa_test.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TestDao extends JpaRepository<Test, Integer>, JpaSpecificationExecutor<Test> {
}
