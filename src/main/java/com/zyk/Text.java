package com.zyk;

import java.io.*;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class Text {
    static{
        File file=new File("src\\main\\resources\\application.properties");
        try {

            BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));
            String str = reader.readLine();
            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
