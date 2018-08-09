package com.itheima;


import com.itheima.domain.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//对象创建细节
public class App4 {
    @Test
    public void ioc_bean_detail(){
        //创建容器: 只能加载类路径下的配置文件
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("容器已经创建");

        Account account1 = (Account) ac.getBean("account");
        Account account2 = (Account) ac.getBean("account");
        System.out.println(account1);
        System.out.println(account2);

    }
}
