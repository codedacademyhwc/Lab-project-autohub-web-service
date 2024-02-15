package com.autohub.web.service.autohubwebservice.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="province")
public class ProvinceEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer id;

    @Column(name="Province_TH")
    private String provinceTh;

    @Column(name="Province_EN")
    private String provinceEn;

    @Column(name="Create_Date")
    private Date createDate;

    @Column(name="Update_Date")
    private Date updateDate;
}
