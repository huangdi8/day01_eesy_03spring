package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; /**
 * Created with IntelliJ IDEA.
 *
 * @Author 11156
 * @create 2019/7/29 20:00
 * Description: No Description
 */

/**
 * 获取sping的IoC核心容器，并根据id获取对象
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
        as.saveAccount();
    }
}
