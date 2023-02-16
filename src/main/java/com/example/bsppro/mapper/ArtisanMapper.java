package com.example.bsppro.mapper;

import com.example.bsppro.entity.Artisan;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

@Mapper
public interface ArtisanMapper extends BaseMapper<Artisan> {

    @Select("SELECT * FROM `artisan` WHERE artisan.loginaid = #{username} and artisan.loginapaw = #{password}")
    Artisan findOneArtisan(@Param("username")String username,@Param("password")String password);

}
