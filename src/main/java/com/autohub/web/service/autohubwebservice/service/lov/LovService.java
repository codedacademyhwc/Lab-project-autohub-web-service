package com.autohub.web.service.autohubwebservice.service.lov;

import java.util.List;

import com.autohub.web.service.autohubwebservice.dto.ResponseBase;
import com.autohub.web.service.autohubwebservice.dto.lov.ProvinceDto;

public interface LovService {
    ResponseBase<List<ProvinceDto>> getProvinces();
}
