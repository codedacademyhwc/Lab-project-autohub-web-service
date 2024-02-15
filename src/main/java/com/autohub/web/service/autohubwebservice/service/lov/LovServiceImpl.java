package com.autohub.web.service.autohubwebservice.service.lov;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.autohub.web.service.autohubwebservice.dto.ResponseBase;
import com.autohub.web.service.autohubwebservice.dto.lov.ProvinceDto;
import com.autohub.web.service.autohubwebservice.repository.ProvinceRepository;

@Service
public class LovServiceImpl implements LovService{

    @Autowired
    ProvinceRepository provinceRepository;

    ModelMapper modelMapper = new ModelMapper();

    public ResponseBase<List<ProvinceDto>> getProvinces() {

        var response = new ResponseBase<List<ProvinceDto>>();
        List<ProvinceDto> data = new ArrayList<>();

        try {
            // get province using Province repository
            var result = provinceRepository.findAll();

            if (result.isEmpty() || result.size() == 0) {

                response.setErrorCode("LS0001");
                response.setErrorMessage("Cannot get province data");
                return response;
            }

            // mapping data

            for(Integer i = 0; i < result.size(); i++){
                var province = modelMapper.map(result.get(i), ProvinceDto.class);
                data.add(province);
            }

            response.setData(data);
            response.setErrorCode("0000");
            response.setErrorMessage("Success");

            return response;

        } catch (Exception ex) {
            response.setErrorCode("9999");
            response.setErrorMessage("Exception was occured : " + ex.getMessage());

            return response;
        }
    }
}
