package com.project.sinchon.controller;

import com.project.sinchon.dto.ReservationInfoDTO;
import com.project.sinchon.dto.ReservationStateDTO;
import com.project.sinchon.dto.RoomDTO;
import com.project.sinchon.dto.UserDTO;
import com.project.sinchon.service.HostService;
import com.project.sinchon.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/manage")
public class HostController {

	@Autowired
	private HostService hostService;

	/**
	 * @description [호스트페이지] 모든 방 조회
	 */
	@GetMapping(value = "/rooms", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<RoomDTO> getRoomList() throws Exception{

		return hostService.getRoomList();
	}

	/**
	 * @description [호스트페이지] 수정하고자 하는 방 정보 가져오기
	 */
	@GetMapping(value = "/room/{room_ID}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public RoomDTO getRoomList(@PathVariable(value="room_ID") int rood_ID) throws Exception{

		return hostService.getRoomForChange(rood_ID);
	}

	/**
	 * @description [호스트페이지] 방 관리 페이지 - 방 정보 수정하기
	 */
	@PutMapping(value = "/room", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public String updateRoom(@RequestBody RoomDTO roomDTO) throws Exception{

		String resultData = null;
		if(hostService.updateRoom(roomDTO) != 0) {
			resultData = "방 정보 수정 성공!";
		} else {
			resultData = "방 정보 수정 실패 ㅠ.ㅠ";
		}

		return resultData;
	}

	/**
	 * @description [호스트페이지] 고객정보 관리 페이지 - 모든 고객 정보 가져오기 (Default : 최근 예약 순)
	 */
	@GetMapping(value = "/guest", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<UserDTO> getGuestInfo() throws Exception{

		return hostService.getGuestInfo();
	}

	/**
	 * @description [호스트페이지] 예약관리 페이지 - 모든 예약 정보 가져오기 (Default : 예약 신청일이 빠른 순)
	 */
	@GetMapping(value = "/reservations?state={state}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ReservationInfoDTO> getReservationInfo(@RequestParam(value="state", defaultValue="1") int state) throws Exception{

		return hostService.getReservationInfo(state);
	}

	/**
	 * @description [호스트페이지] 예약관리 페이지 - 모든 예약 정보 가져오기 (추가 정렬 기준: 체크인 날짜 or 체크아웃 날짜)
	 */
	@GetMapping(value = "/reservations/checkInOut", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ReservationInfoDTO> getReservationInfoByCheckInOut(@RequestBody Map<String, Object> checkInOut) throws Exception{

		return hostService.getReservationInfoByCheckInOut(checkInOut);
	}

	/**
	 * @description [호스트페이지] 예약관리 페이지 - 예약 확정 혹은 취소하기
	 */
	@PutMapping(value = "/reservation", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String updateReservation(@RequestBody ReservationInfoDTO reservataionInfoDTO) throws Exception{

		return hostService.updateReservation(reservataionInfoDTO);
	}


}
