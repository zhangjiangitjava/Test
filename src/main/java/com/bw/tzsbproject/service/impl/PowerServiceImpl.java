package com.bw.tzsbproject.service.impl;

import com.bw.tzsbproject.mapper.PowerMapper;
import com.bw.tzsbproject.pojo.Elev;
import com.bw.tzsbproject.pojo.Power;
import com.bw.tzsbproject.pojo.User;
import com.bw.tzsbproject.service.PowerService;
import com.bw.tzsbproject.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerServiceImpl implements PowerService {
    @Autowired
    private PowerMapper powerMapper;
    @Override
    public User login(User user) {
        return powerMapper.login(user);
    }

    @Override
    public List<Power> findPowerList(Integer userid) {
        return powerMapper.findPowerList(userid);
    }



    @Override
    public List<Elev> export() {
         return powerMapper.export();
    }

    @Override
    public void importElevs(Elev elev) {
       powerMapper.importElevs(elev);
    }

    @Override
    public Integer getCount(String product,String bianhao) {
        return powerMapper.getCount( product, bianhao);
    }

    @Override
    public List<Elev> findAll(PageUtil pageUtil, String product, String bianhao) {
        return powerMapper.findAll(pageUtil,product,bianhao);
    }
}
