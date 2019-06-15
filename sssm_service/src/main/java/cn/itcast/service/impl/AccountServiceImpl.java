package cn.itcast.service.impl;

import cn.itcast.dao.AccountMapper;
import cn.itcast.domain.Item;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public Item findOne(Integer id){
        Item item = accountMapper.findOne(id);
        System.out.println(item);
        return item;
    }
}
