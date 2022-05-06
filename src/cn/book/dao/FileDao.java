package cn.book.dao;

import cn.book.pojo.User;

import java.util.Set;
import java.util.List;

public interface FileDao {
    public List<User> getAllUser();

    User getUserByidOrName(String admid);
}
