package com.itheima;

import com.itheima.domain.Account;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //创建Spring的IOC容器对象
        //IOC容器=ApplicationContext+applicationContext.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取对象;<bean id="account"..>
        Account account1 = (Account) ac.getBean("account");
        Account account2 = (Account) ac.getBean("account");
        //默认就是单例
        System.out.println(account1);
        System.out.println(account2);
    }
}
