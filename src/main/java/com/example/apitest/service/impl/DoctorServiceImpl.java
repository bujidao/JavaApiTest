package com.example.apitest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.apitest.domain.Doctor;
import com.example.apitest.service.DoctorService;
import com.example.apitest.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
implements DoctorService{

}




