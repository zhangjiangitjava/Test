package com.bw.tzsbproject.util;

public class Code {
    //生成六位随机码
    public static long creatCode(){
        double v = (Math.random() * 1000000) - 1;
        long a=(long)v;

        return a;
    }
}
