package com.example.catbellrow.service.impl;

import com.example.catbellrow.dao.MemberDao;
import com.example.catbellrow.service.MemberOfCongressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


// 이 어노테이션이 있어야 서비스 클래스라는 것을 알수 있다.
@Service
public class MemberOfCongressServiceImpl implements MemberOfCongressService {

    @Resource(name="memberDao")
    private MemberDao memberDao;


    @Override
    public String getCongMember() throws Exception {

        return memberDao.getMember();
    }
}
