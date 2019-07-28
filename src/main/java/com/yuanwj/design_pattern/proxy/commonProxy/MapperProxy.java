package com.yuanwj.design_pattern.proxy.commonProxy;

public class MapperProxy implements UserMapper {

    private UserMapperImpl userMapper;

    public MapperProxy(UserMapperImpl userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void findAll() {
        long start = System.currentTimeMillis();
        userMapper.findAll();
        long end = System.currentTimeMillis();
        System.out.println("查询数据库耗时"+(end-start)+"毫秒");
    }
}
