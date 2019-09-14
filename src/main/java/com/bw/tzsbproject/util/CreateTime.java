package com.bw.tzsbproject.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateTime {
        //生成日期  年月日
        public static String getDateTime (){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String txDate = simpleDateFormat.format(new Date());
            return txDate;
        }
        //生成时间  时分秒
        public static String getTime (){
            SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
            String txTime = dateFormat.format(new Date());
            return txTime;
        }

}
