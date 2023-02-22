package com.example.bsppro.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.bsppro.entity.Cartypes;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
public interface CartypesService extends IService<Cartypes> {
    int update(Cartypes updateParam);

    int create(Cartypes updateParam);

    IPage<Cartypes> list(IPage<Cartypes> page, Map<String, Object> map);

    Cartypes where(Map<String, Object> map);

}
