package com.ssm.test.dao;

import com.ssm.test.model.wechatappUserinfo;

public interface wechatappUserinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(wechatappUserinfo record);

    int insertSelective(wechatappUserinfo record);

    wechatappUserinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(wechatappUserinfo record);

    int updateByPrimaryKey(wechatappUserinfo record);
}