package com.example.dynamicHikaricp.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.dynamicHikaricp.mapper.TestMapper;
import com.example.dynamicHikaricp.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Karl
 * @since 2023-05-25
 */
@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @DS("td")
    @Override
    public Integer testTd() {
        return testMapper.testTd();
    }

    @Override
    public Integer testMysql() {
        return testMapper.testMysql();
    }
}