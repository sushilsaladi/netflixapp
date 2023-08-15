package com.work.netflixapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.work.netflixapp.dao.NetflixCodesDAO;
import com.work.netflixapp.netflix_codes;

@Service
public class NetflixCodesService {
    
    @Autowired
    NetflixCodesDAO codesDAO;

    public List<netflix_codes> getAllNetflixCodes(){
        return codesDAO.findAll();        
    }
}
