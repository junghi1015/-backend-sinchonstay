package com.example.catbellrow.mapper;

import com.example.catbellrow.vo.MemberOfCongressManVO;
import org.apache.ibatis.annotations.Mapper;

// mybatis(xml파일의 sql쓰는 파일에 접근을 하기 위해 명명해야 하는 어노테이션)

@Mapper
public interface CongMemberMapper {
    //메서드 이름은 xml의 id와 매핑(일치)이 되어야 한다.
    MemberOfCongressManVO selectMemberCong() throws Exception;
}
