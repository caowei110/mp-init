package com.fengwenyi.mybatis_plus_example.service.impl;

import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengwenyi.mybatis_plus_example.repository.CoinTestDao;
import com.fengwenyi.mybatis_plus_example.domain.CoinTest;
import com.fengwenyi.mybatis_plus_example.service.CoinTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Wenyi Feng
 * @since 2018-08-31
 */
@Service
@Slf4j
public class CoinTestServiceImpl extends ServiceImpl<CoinTestDao, CoinTest> implements CoinTestService {

    @Override
    public CoinTest queryCityAll(String id) {

        return this.getById(id);
    }


}
