package com.yuanwj.design_pattern.proxy.commonProxy;

public class UserMapperImpl implements UserMapper {

    @Override
    public void findAll() {
        System.out.println("数据库用户数量为200");

    }
}
