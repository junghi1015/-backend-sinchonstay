package com.example.catbellrow.service.impl;

import com.example.catbellrow.dao.MemberDao;
import com.example.catbellrow.service.MemberOfCongressService;
import com.example.catbellrow.vo.BillVO;
import com.example.catbellrow.vo.MemberOfCongressManVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


// service 의 추상화(간소화)된 메서드를 자세하게 정의해야하는 구간
@Service
public class MemberOfCongressServiceImpl implements MemberOfCongressService {

    @Autowired
    private MemberDao memberDao;


    /**
     * @description 국회의원 리스트 출력
     */
    @Override
    public List<MemberOfCongressManVO> getCongMember() throws Exception {

        return memberDao.selectName();
    }

    /**
     * @description 법안 리스트 출력
     */
    @Override
    public List<BillVO> getRaws() throws Exception {
        return memberDao.selectRaws();
    }
}
