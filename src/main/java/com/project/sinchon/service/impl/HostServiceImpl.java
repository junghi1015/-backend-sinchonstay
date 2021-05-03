package com.project.sinchon.service.impl;

import com.project.sinchon.dao.HostDAO;
import com.project.sinchon.dto.ReservationInfoDTO;
import com.project.sinchon.dto.ReservationStateDTO;
import com.project.sinchon.dto.RoomDTO;
import com.project.sinchon.dto.UserDTO;
import com.project.sinchon.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HostServiceImpl implements HostService {

    @Autowired
    private HostDAO hostDAO;

    /**
     * @description 호스트가 등록한 모든 방 조회
     */
    @Override
    public List<RoomDTO> getRoomList() throws Exception {
        return hostDAO.getRoomList();
    }

    /**
     * @description 호스트가 수정하고자 하는 방정보 가져오기
     */
    @Override
    public RoomDTO getRoomForChange(int room_ID) throws Exception {
        return hostDAO.getRoomForChange(room_ID);
    }

    /**
     * @description 예약관리 페이지 - 방 정보 수정하기
     */
    @Override
    public int updateRoom(RoomDTO roomDTO) throws Exception {

        return hostDAO.updateRoom(roomDTO);
    }

    /**
     * @description 고객정보 관리 페이지 - 모든 고객 정보 가져오기 (Default : 최근 예약 순)
     */
    @Override
    public List<UserDTO> getGuestInfo() throws Exception {
        return hostDAO.getGuestInfo();
    }

    /**
     * @description 예약관리 페이지 - 모든 예약 정보 가져오기 (Default : 예약 신청일이 빠른 순)
     */
    @Override
    public List<ReservationInfoDTO> getReservationInfo(int state) throws Exception {
        return hostDAO.getReservationInfo(state);
    }

    /**
     * @description 예약관리 페이지 - 모든 예약 정보 가져오기 (추가 정렬 기준: 체크인 날짜 or 체크아웃 날짜)
     */
    @Override
    public List<ReservationInfoDTO> getReservationInfoByCheckInOut(Map<String, Object> checkInOut) throws Exception {
        return hostDAO.getReservationInfoByCheckInOut(checkInOut);
    }

    /**
     * @description 예약관리 페이지 - 예약 확정 혹은 취소하기
     */
    @Override
    public String updateReservation(ReservationInfoDTO reservataionInfoDTO) throws Exception {

        return hostDAO.updateReservation(reservataionInfoDTO);
    }


}
