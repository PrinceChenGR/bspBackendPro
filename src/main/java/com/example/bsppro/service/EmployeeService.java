package com.example.bsppro.service;

import com.example.bsppro.entity.Artisan;
import com.example.bsppro.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
public interface EmployeeService extends IService<Employee> {

    public Employee findOne(String unm, String pwd)throws Exception;

}
