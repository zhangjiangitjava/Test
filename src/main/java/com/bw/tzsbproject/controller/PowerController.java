package com.bw.tzsbproject.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.bw.tzsbproject.pojo.Elev;
import com.bw.tzsbproject.pojo.Power;
import com.bw.tzsbproject.pojo.User;
import com.bw.tzsbproject.service.PowerService;

import com.bw.tzsbproject.util.Code;
import com.bw.tzsbproject.util.CreateTime;
import com.bw.tzsbproject.util.ExcelUtiles;
import com.bw.tzsbproject.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class PowerController {
    @Autowired
    private PowerService powerService;
    //登录
    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        User u=powerService.login(user);
        if(u!=null){
            session.setAttribute("u",u);
            return "a";

        }
        return "redirect:index.jsp";
    }
    //根据用户的id找对应的权限
    @RequestMapping("/findPowerById")
    @ResponseBody
    public List<Power> findPowerList(Integer userid){
        List<Power> powerList=powerService.findPowerList(userid);
        return powerList;

    }
    //追溯
    @RequestMapping("/elevzhuisu")
    public String findAll(Model model,String page,String product,String bianhao){
        Integer count=powerService.getCount(product,bianhao);
        PageUtil pageUtil = new PageUtil(page,count,2);
        List<Elev> elist=powerService.findAll(pageUtil,product,bianhao);
        model.addAttribute("elist",elist);
        model.addAttribute("pageUtil",pageUtil);
        model.addAttribute("product",product);
        model.addAttribute("bianhao",bianhao);
        return "list";
    }
    //报表导出
    @RequestMapping("/export")
    @ResponseBody
    //String[] columnNames={"ID","电梯生产单位","电梯生产单位名称","电梯生产许可证编号","电梯生产单位地址","联系电话","负责人电话","负责人姓名","上月出厂数量","本月出厂数量"};
    public List<Elev> export(HttpServletResponse response){
        List<Elev> elist=powerService.export();
        ExcelUtiles.exportExcel(elist,"名称","电梯表",Elev.class,"xxx.xls",response);
        return elist;

    }
    //报表导入
    @PostMapping("/importExcel2")
    public void importExcel2(@RequestParam("file") MultipartFile file){
        ImportParams importParams = new ImportParams();
        //数据处理
        importParams.setHeadRows(1);
        importParams.setTitleRows(1);
        //验证
        importParams.setNeedVerfiy(true);
        try {
            List<Elev> elevs = ExcelUtiles.importExcel(file, 1, 1, Elev.class);
            for (Elev elev : elevs) {
                System.out.println(elev);
                powerService.importElevs(elev);
            }

        }
         catch (Exception e) {
        }
    }
    //拼接流水号
    @RequestMapping("/pingjie")
    public String pingjie(){
        long code = Code.creatCode();
        String dateTime = CreateTime.getDateTime();
        String time = CreateTime.getTime();
        //流水
        String liuwater=dateTime+time+code;
        System.err.println("流水号为"+liuwater);
        return "";
    }


}
