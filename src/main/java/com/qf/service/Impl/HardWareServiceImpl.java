package com.qf.service.Impl;

import com.qf.dao.HardWareDao;
import com.qf.entity.HardWare;
import com.qf.service.HardWareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HardWareServiceImpl implements HardWareService {
    @Autowired HardWareDao hardWareDao;
    @Override
    public List<HardWare> selectAll() {
        return hardWareDao.selectAll();
    }

    @Override
    public int update(HardWare hardWare) {
        return hardWareDao.update(hardWare);
    }
}
