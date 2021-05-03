package com.project.sinchon.service;

import com.project.sinchon.dto.ReservationInfoDTO;
import com.project.sinchon.dto.ReservationStateDTO;
import com.project.sinchon.dto.RoomDTO;
import com.project.sinchon.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


public interface HostService {

    /**
     * @description 호스트가 등록한 모든 방 조회
     */
    List<RoomDTO> getRoomList() throws Exception;

    /**
     * @description 호스트가 수정하고자 하는 방정보 가져오기
     */
    RoomDTO getRoomForChange(int room_ID) throws Exception;

    /**
     * @description 방 관리 페이지 - 방 정보 수정하기
     */
    int updateRoom(RoomDTO roomDTO) throws Exception;

    /**
     * @description 고객정보 관리 페이지 - 모든 고객 정보 가져오기 (Default : 최근 예약 순)
     */
    List<UserDTO> getGuestInfo() throws Exception;

    /**
     * @description 예약관리 페이지 - 모든 예약 정보 가져오기 (Default : 예약 신청일이 빠른 순)
     */
    List<ReservationInfoDTO> getReservationInfo(int state) throws Exception;

    /**
     * @description 예약관리 페이지 - 모든 예약 정보 가져오기 (추가 정렬 기준: 체크인 날짜 or 체크아웃 날짜)
     */
    List<ReservationInfoDTO> getReservationInfoByCheckInOut(Map<String, Object> checkInOut) throws Exception;

    /**
     * @description 예약관리 페이지 - 예약 확정 혹은 취소하기
     */
    String updateReservation(ReservationInfoDTO reservataionInfoDTO) throws Exception;
}
