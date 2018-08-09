package com.itheima.domain;

public class Account {
    public Account(){
        System.out.println("创建Account对象");
    }

    //初始化方法,在创建对象之后执行
    public void init_(){
        System.out.println("调用init_()初始化");
    }

    //释放资源方法,在销毁容器之前执行
    public void destroy_(){
        System.out.println("在容器销毁之前执行destroy_()方法");
    }
}
