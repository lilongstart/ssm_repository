package cn.itcast.service;

import cn.itcast.domain.Account;
import cn.itcast.domain.Item;

public interface AccountService  {
    public Item findOne(Integer id);
}
