package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author 11156
 * @create 2019/7/29 19:57
 * Description: No Description
 */
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
