package com.example.bsppro.mapper;

import com.example.bsppro.entity.Artisan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
public interface ArtisanMapper extends BaseMapper<Artisan> {

    @Select("")
    List<Artisan> findOneArtisan();

}
