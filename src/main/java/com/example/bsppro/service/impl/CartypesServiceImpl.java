package com.example.bsppro.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.bsppro.entity.Cartypes;
import com.example.bsppro.mapper.CartypesMapper;
import com.example.bsppro.service.CartypesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
@Service
public class CartypesServiceImpl extends ServiceImpl<CartypesMapper, Cartypes> implements CartypesService {
    @Override
    public int update(Cartypes updateParam) {
        return baseMapper.update(updateParam);
    }

    @Override
    public int create(Cartypes updateParam) {
        return baseMapper.create(updateParam);
    }

    @Override
    public IPage<Cartypes> list(IPage<Cartypes> page, Map<String, Object> map) {
        return baseMapper.list(page, map);
    }

    @Override
    public Cartypes where(Map<String, Object> map) {
        return baseMapper.where(map);
    }
}
