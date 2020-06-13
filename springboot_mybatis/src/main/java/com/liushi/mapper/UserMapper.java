package com.liushi.mapper;

import com.liushi.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 11:08
 * @Version V1.0
 **/
@Mapper
public interface UserMapper {
    List<User> findAll();
}
