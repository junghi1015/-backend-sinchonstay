package com.project.sinchon.service.impl;


import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.sinchon.dao.UserDAO;
import com.project.sinchon.dto.UserDTO;
import com.project.sinchon.dto.UserDetailsVO;

import java.util.ArrayList;
import java.util.Collections;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	private final UserDAO userDAO = new UserDAO();
	
    @Override
    public UserDetails loadUserByUsername(String user_ID) throws UsernameNotFoundException {
		// UserDAO로 DB에서 유저정보를 UserDTO에 담는다.
    	UserDTO userAuthes = userDAO.findByUserId(user_ID);
		
		// User정보를 정상적으로 가지고 왔는지 검증하고,
		if(userAuthes.getUser_ID().isEmpty()) {
			throw new UsernameNotFoundException("User "+user_ID+" Not Found!");
		}
		
		// UserDetailsVO에 UserDTO를 담아서 권한을 생성한다.
		return new UserDetailsVO(userAuthes);
	}

//	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
//	public String InsertUser(UserDTO userDTO) {
//		
//		userDTO.setPwd(bCryptPasswordEncoder.encode(userDTO.getPwd()));
//		int flag = userDTO.userSave(userDTO);		
//		if (flag > 0) {
//
//			int userNo = homeMapper.findUserNo(userVO.getId());
//			int roleNo = homeMapper.findRoleNo(userVO.getRoleName());
//
//			homeMapper.userRoleSave(userNo, roleNo);
//
//			return "success";
//		}	 	
//		return "fail";
//	}
//
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//		
}
    	
    	
    	
    	//        return userDAO.findByUserEmail(user_ID);
//    }
    

		
	