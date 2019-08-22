package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author 11156
 * @create 2019/7/29 19:55
 * Description: No Description
 */
public class AccountServiceImpl implements IAccountService {
    private IAccountDao iAccountDao = new AccountDaoImpl();
    @Override
    public void saveAccount() {
        iAccountDao.saveAccount();
    }
}
