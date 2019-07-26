package com.qf.service;

import com.qf.entity.HardWare;

import java.util.List;

public interface HardWareService {
    List<HardWare> selectAll();
    int update(HardWare hardWare);
}
