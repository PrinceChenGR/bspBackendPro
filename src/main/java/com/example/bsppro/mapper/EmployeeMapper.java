package com.example.bsppro.mapper;

import com.example.bsppro.entity.Artisan;
import com.example.bsppro.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    @Select("SELECT * FROM `employee` WHERE employee.emplogenid = #{username} and employee.emplogepaw = #{password}")
    Employee findOneEmployee(@Param("username")String username, @Param("password")String password);

}
