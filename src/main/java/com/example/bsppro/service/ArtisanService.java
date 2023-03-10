package com.example.bsppro.service;

import com.example.bsppro.entity.Artisan;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */

public interface ArtisanService extends IService<Artisan> {
    public Artisan findOne(String unm,String pwd)throws Exception;
}
