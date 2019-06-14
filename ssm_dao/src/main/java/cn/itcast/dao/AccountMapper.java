package cn.itcast.dao;
import cn.itcast.domain.Item;

public interface AccountMapper {
    public Item findOne(Integer id);
}
