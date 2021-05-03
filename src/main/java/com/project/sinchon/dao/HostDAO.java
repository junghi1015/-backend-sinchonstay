package com.project.sinchon.dao;

import com.project.sinchon.dto.ReservationInfoDTO;
import com.project.sinchon.dto.ReservationStateDTO;
import com.project.sinchon.dto.RoomDTO;
import com.project.sinchon.dto.UserDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class HostDAO {

    @Autowired
    private SqlSession sqlSession;
    private static final String namespace = "com.project.sinchon.mapper.HostMapper";

    /**
     * @description 호스트가 등록한 모든 방 조회
     */
    public List<RoomDTO> getRoomList() {
        return sqlSession.selectList(namespace + ".getRoomList");
    }

    /**
     * @description 호스트가 수정하고자 하는 방정보 가져오기
     */
    public RoomDTO getRoomForChange(int room_ID) {
        return sqlSession.selectOne(namespace + ".getRoomForChange", room_ID);
    }

    /**
     * @description 예약관리 페이지 - 방 정보 수정하기
     */
    public int updateRoom(RoomDTO roomDTO) {
        return sqlSession.update(namespace + ".updateRoom", roomDTO);
    }

    /**
     * @description 고객정보 관리 페이지 - 모든 고객 정보 가져오기 (Default : 최근 예약 순)
     */
    public List<UserDTO> getGuestInfo() {
        return sqlSession.selectList(namespace + ".getGuestInfo");
    }

    /**
     * @description 예약관리 페이지 - 모든 예약 정보 가져오기 (Default : 예약 신청일이 빠른 순)
     */
    public List<ReservationInfoDTO> getReservationInfo(int state) {
        return sqlSession.selectList(namespace + ".getReservationInfo", state);
    }

    /**
     * @description 예약관리 페이지 - 모든 예약 정보 가져오기 모든 예약 정보 가져오기 (추가 정렬 기준: 체크인 날짜 or 체크아웃 날짜)
     */
    public List<ReservationInfoDTO> getReservationInfoByCheckInOut(Map<String, Object> checkInOut) {


        List<ReservationInfoDTO> resultData = null;
        //checkInOut이 1이면 체크인 날짜 기준, 2면 체크아웃 날짜 기준
        if (checkInOut.get("order").equals(1)) {
            resultData = sqlSession.selectList(namespace + ".getReservationInfoByCheckIn", checkInOut);
        } else if (checkInOut.get("order").equals(2)){
            resultData = sqlSession.selectList(namespace + ".getReservationInfoByCheckOut", checkInOut);
        }
        return resultData;
    }

    /**
     * @description 예약관리 페이지 - 예약 확정 혹은 취소하기
     */
    public String updateReservation(ReservationInfoDTO reservataionInfoDTO) {

         String resultData = null;

        if (reservataionInfoDTO.getState() == 2) {
            sqlSession.update(namespace + ".updateReservation", reservataionInfoDTO);
            resultData = "예약 확정됐습니다.";
        } else if (reservataionInfoDTO.getState() == 3) {
            sqlSession.update(namespace + ".cancelReservation", reservataionInfoDTO);
            resultData = "예약 취소됐습니다.";
        } else {
            resultData = "예약정보 수정에 실패했습니다. 다시 시도해주세요.";
        }

        return resultData;
    }
}
