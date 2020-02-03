package com.example.spring_boot_jpa_test.service.impl;

import com.example.spring_boot_jpa_test.dao.TestDao;
import com.example.spring_boot_jpa_test.model.Test;
import com.example.spring_boot_jpa_test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Test getOneTest(Integer id) {

        Test t = testDao.getOne(id);
        return t;
    }
}
