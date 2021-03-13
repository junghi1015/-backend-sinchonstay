package com.example.catbellrow.service.impl;

import com.example.catbellrow.mapper.CongMemberMapper;
import com.example.catbellrow.service.MemberOfCongressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// 이 어노테이션이 있어야 서비스 클래스라는 것을 알수 있다.
@Service
public class MemberOfCongressServiceImpl implements MemberOfCongressService {


    @Autowired
    private CongMemberMapper congMemberMapper;


    @Override
    public String getCongMember() throws Exception {
        return "tttteeeeesssstttttt";
    }
}
