package com.example.catbellrow.dao;

import com.example.catbellrow.vo.BillVO;
import com.example.catbellrow.vo.MemberOfCongressManVO;
import com.example.catbellrow.vo.RawContentsVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectList("com.example.catbellrow.selectRaws");
    }

    /**
     * @description 법안 리스트 출력
     */
    public List<RawContentsVO> getRawList() {
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectList("com.example.catbellrow.getRawList");
    }
    /**
     * @description 법안 리스트 출력
     */
    public int rawListCount() {
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectOne("com.example.catbellrow.rawListCount");
    }

    /**
     * @description 검색 결과 조회
     */
    public List<RawContentsVO> rawListSearch() {
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectList("com.example.catbellrow.rawListSearch");
    }

    /**
     * @description 최신순 법안 조회
     */
    public List<RawContentsVO> searchContents() {
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectList("com.example.catbellrow.searchContents");
    }
}