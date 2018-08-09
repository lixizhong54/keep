package com.itheima;

import com.itheima.domain.Account;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

//创建容器的几种方式
public class App3 {
        //方式1: ClassPathXmlApplicationContext
        //小结: 创建容器时候,自动创建单例的对象
    @Test
    public void ioc1(){
        //创建容器: 只能加载类路径下的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

    }

    //方式2: FileSystemXmlApplicationContext
    //小结: 创建容器时候,自动创建单例的对象
    @Test
    public void ioc2(){
        // 创建容器： 可以加载外部的配置文件
        ApplicationContext ac = new
    FileSystemXmlApplicationContext("E:\\code\\javamavacode\\newjava\\day53-spring-03\\src" +
                "\\main\\resources\\applicationContext.xml");

    }
    //方式3: BeanFactory创建容器
    //小结: 创建容器时候,默认没有创建单例的对象
    @Test
    public void ioc3(){

        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Account a1 = (Account) factory.getBean("account");//---->创建User对象
        Account a2 = (Account) factory.getBean("account");//---->创建User对象
        Account a3 = (Account) factory.getBean("account");//---->创建User对象

    }
}
