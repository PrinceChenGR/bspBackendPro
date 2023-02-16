package com.example.bsppro.controller;

import com.example.bsppro.entity.Artisan;
import com.example.bsppro.mapper.ArtisanMapper;
import com.example.bsppro.service.ArtisanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Console;

@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private ArtisanService artisanService;

    @GetMapping("/Login/{data}")
    @ResponseBody
    public String findOne(@PathVariable("data")String data){
        if(data!=null){
            System.out.println("传输正常");
            return "ok";
        }else{
            return "200";
        }

    }



}
