package com.example.bsppro.controller;

import com.example.bsppro.entity.Artisan;
import com.example.bsppro.entity.Employee;
import com.example.bsppro.mapper.ArtisanMapper;
import com.example.bsppro.service.ArtisanService;
import com.example.bsppro.service.impl.ArtisanServiceImpl;
import com.example.bsppro.service.impl.EmployeeServiceImpl;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.Map;

@Log4j2
@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private ArtisanServiceImpl artisanService;
    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/Login")
    @ResponseBody
    public String findOne(@RequestBody Map<String, Object> param) throws Exception {

        if(param!=null){

            log.info(param.get("position"));
            log.info(param.get("username"));
            log.info(param.get("password"));

            String position = String.valueOf(param.get("position"));
            String username = String.valueOf(param.get("username"));
            String password = String.valueOf(param.get("password"));
            if(position.equals("超级Admin")){
                log.info("进入admin管理员登录渠道");
                if(username.equals("admin")&&password.equals("123"))return position;
                return "200";
            }
            else if(position.equals("技工")){
                log.info("进入技工登录渠道");
                Artisan artisan = artisanService.findOne(username,password);
                if(artisan!=null){
                    return position;
                }else{
                    return "200";
                }
            }
            else if(position.equals("员工")){
                log.info("进入员工登录渠道");
                Employee employee = employeeService.findOne(username,password);
                if(employee!=null){
                    return position;
                }else{
                    return "200";
                }
            }

            return "200";
        }else{
            return "200";
        }

    }



}
