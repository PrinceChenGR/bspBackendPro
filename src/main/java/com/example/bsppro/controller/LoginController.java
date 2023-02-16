package com.example.bsppro.controller;

import com.example.bsppro.entity.Artisan;
import com.example.bsppro.mapper.ArtisanMapper;
import com.example.bsppro.service.ArtisanService;
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
    private ArtisanService artisanService;

    @PostMapping("/Login")
    @ResponseBody
    public String findOne(@RequestBody Map<String, Object> param){
        if(param!=null){
            log.info(param.get("usersname"));
            log.info(param.get("password"));
            log.info(param.get("position"));
            System.out.println("传输正常");
            return "ok";
        }else{
            return "200";
        }

    }



}
