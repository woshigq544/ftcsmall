package com.example.myftctest.ftcmapper;

import com.example.myftctest.ftcentity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer likeid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer likeid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}