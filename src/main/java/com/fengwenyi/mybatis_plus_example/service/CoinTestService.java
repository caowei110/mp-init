package com.fengwenyi.mybatis_plus_example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengwenyi.mybatis_plus_example.domain.CoinTest;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Wenyi Feng
 * @since 2018-08-31
 */
public interface CoinTestService extends IService<CoinTest> {

    CoinTest queryCityAll(String id);
}
