package com.itheima.factory;

import com.itheima.domain.Account;

public class AccountFactory {
    //静态方法创建对象
    public static Account getAccountByStatic(){
        return new Account();
    }
    //非静态方法(实例方法) 创建对象
    public Account getAccount(){
        return new Account();
    }
}
