package com.autohub.web.service.autohubwebservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autohub.web.service.autohubwebservice.dto.ResponseBase;
import com.autohub.web.service.autohubwebservice.dto.lov.ProvinceDto;
import com.autohub.web.service.autohubwebservice.service.WebDetail.WebDetailService;
import com.autohub.web.service.autohubwebservice.service.lov.LovService;


@RestController
@RequestMapping("/api/autohub/web-service")
@CrossOrigin(origins = {"null"})
public class AutoHubController {
    
    @Autowired
    WebDetailService webDetailService;

    @Autowired
    LovService lovService;
    
    @GetMapping("/version")
    public ResponseEntity<ResponseBase<String>> ServiceVertion() {
        
        var response = webDetailService.GetVersion();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/lov/province")
    public ResponseEntity<ResponseBase<List<ProvinceDto>>> getMethodName() {

        var response = lovService.getProvinces();
        return ResponseEntity.ok(response);
    } 
    
}
