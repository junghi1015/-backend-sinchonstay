package com.example.catbellrow.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CongMemberMapper {
    String selectMemberCong() throws Exception;
}
