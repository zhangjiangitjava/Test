package com.bw.tzsbproject.service;

import com.bw.tzsbproject.pojo.Elev;
import com.bw.tzsbproject.pojo.Power;
import com.bw.tzsbproject.pojo.User;
import com.bw.tzsbproject.util.PageUtil;

import java.util.List;

public interface PowerService {
    User login(User user);

    List<Power> findPowerList(Integer userid);

    List<Elev> export();

    void importElevs(Elev elev);

    Integer getCount(String product,String bianhao);

    List<Elev> findAll(PageUtil pageUtil, String product, String bianhao);
}
