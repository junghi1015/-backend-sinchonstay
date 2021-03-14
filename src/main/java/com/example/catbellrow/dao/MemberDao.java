package com.example.catbellrow.dao;

import com.example.catbellrow.vo.BillVO;
import com.example.catbellrow.vo.MemberOfCongressManVO;
import com.example.catbellrow.vo.MemberVO;
import com.example.catbellrow.vo.RawContentsVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
 *
 * title : data db access
 * author : 정효인
 * date : 2021.03.14
 *
 * */

//mybatis에(sql 쿼리 작성구간)에 작업을 요청하는 구간
@Repository
public class MemberDao {

    @Autowired
    private SqlSession sqlSession;

    /**
     * @description 국회의원 리스트 출력
     */
    public List<MemberOfCongressManVO> getCongMember(){
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectList( "com.example.catbellrow.getCongMember");
    }

    /**
     * @description 법안 리스트 출력
     */
    public List<BillVO> selectRaws() {
        return sqlSession.selectList("com.example.catbellrow.selectRaws");
    }

    /**
     * @description 법안 리스트 출력
     */
    public List<RawContentsVO> getRawList() {
        return sqlSession.selectList("com.example.catbellrow.getRawList");
    }
    /**
     * @description 법안 리스트 출력
     */
    public int rawListCount() {

        return sqlSession.selectOne("com.example.catbellrow.rawListCount");
    }

    /**
     * @description 검색 결과 조회
     */
    public List<RawContentsVO> rawListSearch(String keyword) {
        return sqlSession.selectList("com.example.catbellrow.rawListSearch", keyword);
    }

    /**
     * @description 로그인 조회
     */
    public int login(MemberVO vo) {
        return sqlSession.selectOne("com.example.catbellrow.login", vo);
    }

    /**
     * @description 최신순 법안 조회
     */
    public List<RawContentsVO> rawListUptodate(String pram) {
        return sqlSession.selectList("com.example.catbellrow.rawListUptodate", pram);
    }

    /**
     * @description 사이드 버튼 조회
     */
    public List<RawContentsVO> subListSearch(String pram) {
        return sqlSession.selectList("com.example.catbellrow.subListSearch", pram);
    }

    /**
     * @description 대수만으로 조회
     */
    public List<RawContentsVO> rawListSeason(String pram) {
        return sqlSession.selectList("com.example.catbellrow.rawListSeason", pram);
    }

    /**
     * @description 대수 + 키워로 조회
     */
    public List<RawContentsVO> rawListAll(RawContentsVO vo) {
        return sqlSession.selectList("com.example.catbellrow.rawListAll", vo);
    }
}