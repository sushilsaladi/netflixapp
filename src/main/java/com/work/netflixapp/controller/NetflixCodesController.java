package com.work.netflixapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work.netflixapp.netflix_codes;
import com.work.netflixapp.service.NetflixCodesService;

@RestController
@RequestMapping("browse")
public class NetflixCodesController {
    
    @Autowired
    NetflixCodesService codesService;

    @GetMapping("genre")
    public List<netflix_codes> getAllCodes(){
        //list all codes
        return codesService.getAllNetflixCodes();
    }
}

// User -> Controller Layer -> Service Layer(business logic) -> DAO -> Postgresql DB