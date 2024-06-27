package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.Entity.Statistical;
import com.example.quanlysinhvien.Repository.StatisticalRepository;
import com.example.quanlysinhvien.Service.StatisticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticalServiceImp implements StatisticalService {

    @Autowired
    StatisticalRepository statisticalRepository;

    @Override
    public Statistical create(){
        Statistical statistical = new Statistical();
        statistical.setPointTraining(100);
        statistical.setPointAvg(0);
        Statistical statisticalSave = statisticalRepository.save(statistical);
        return statisticalSave;
    }
}
