package com.zyk;

import java.io.File;
import java.io.IOException;

public class Text3 {
    static{

        try {

            Runtime.getRuntime().exec("git init");
            Runtime.getRuntime().exec("git remote add origin git@github.com:zhangyoukun1/ZYK.git");

            Runtime.getRuntime().exec("git add .");
            Runtime.getRuntime().exec("git commit -m \"hello\"");
            Runtime.getRuntime().exec("git pull --rebase origin master");
            Runtime.getRuntime().exec("git push -u origin master");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}