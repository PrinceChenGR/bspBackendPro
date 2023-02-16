package com.example.bsppro.service.impl;

import com.example.bsppro.entity.Artisan;
import com.example.bsppro.entity.Employee;
import com.example.bsppro.mapper.ArtisanMapper;
import com.example.bsppro.mapper.EmployeeMapper;
import com.example.bsppro.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    private EmployeeMapper mapper;

    @Override
    public Employee findOne(String unm, String pwd)throws Exception{
        if(unm ==null||pwd==null){
            throw new IllegalArgumentException("unm or pwd are null!");
        }
        return mapper.findOneEmployee(unm,pwd);
    }

}
