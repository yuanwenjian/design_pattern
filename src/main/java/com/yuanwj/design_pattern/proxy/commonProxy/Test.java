package com.yuanwj.design_pattern.proxy.commonProxy;

public class Test {
    public static void main(String[] args) {
        UserMapperImpl userMapper = new UserMapperImpl();
        MapperProxy mapperProxy = new MapperProxy(userMapper);
        mapperProxy.findAll();

    }
}
