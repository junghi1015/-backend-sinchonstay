package com.project.sinchon.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.project.sinchon.dto.UserDTO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserDetailsVO implements UserDetails {
	private UserDTO userDTO;
	
	// UserDetailsVO 생성자
	public UserDetailsVO(UserDTO userAuthes) {
		this.userDTO = userAuthes;
	}
	
	// User의 권한 생성 : ishost속성 값 기준으로 생성 (false : 일반사용자, true: 관리자) 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if (userDTO.isIshost()) {
			authorities.add(new SimpleGrantedAuthority("ADMIN"));
		} else {
			authorities.add(new SimpleGrantedAuthority("USER"));
		}
		return authorities;
    }

    @Override
    public String getPassword() {
        return userDTO.getPwd();
    }

    @Override
    public String getUsername() {
        return userDTO.getUser_ID();
    }

    @Override
    public boolean isAccountNonExpired() { // 유저 아이디가 만료되었는지
        return true;
    }

    @Override
    public boolean isAccountNonLocked() { // 유저 아이디가 만료되었는지
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // 비밀번호 만료되었는지
        return true;
    }

    @Override
    public boolean isEnabled() { // 계정활성화 되었는지
        return true;
    }
}