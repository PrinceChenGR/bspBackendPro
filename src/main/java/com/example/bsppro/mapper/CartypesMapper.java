package com.example.bsppro.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.bsppro.entity.Cartypes;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
public interface CartypesMapper extends BaseMapper<Cartypes> {

    int update(@Param("param") Cartypes updateParam);

    int create(@Param("param") Cartypes updateParam);

    IPage<Cartypes> list(IPage<Cartypes> page, @Param("param") Map<String, Object> map);

    Cartypes where(@Param("param") Map<String, Object> map);
}
