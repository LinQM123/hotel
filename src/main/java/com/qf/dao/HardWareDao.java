package com.qf.dao;

import com.qf.entity.HardWare;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HardWareDao {
    List<HardWare> selectAll();
    int update( HardWare hardWare);
}
