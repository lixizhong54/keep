package com.itheima;

import com.itheima.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    //工厂类的静态方法创建对象,测试
    @Test
    public void ioc_createobj_static(){
        //创建容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取对象
        Account account = ac.getBean("account2",Account.class);
        Account account2 = ac.getBean("account3",Account.class);


    }

}
