package com.zhou.dao;
import com.zhou.pojo.User;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface UserMapper {
    List<User> findAll();
}
