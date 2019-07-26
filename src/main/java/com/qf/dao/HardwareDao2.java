package com.qf.dao;

import com.qf.entity.HardWare;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareDao2 {
    Integer addHardware(HardWare hardWare);
}
