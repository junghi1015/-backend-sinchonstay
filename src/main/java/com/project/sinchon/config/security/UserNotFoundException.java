package com.project.sinchon.config.security;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String userEmail){
        super(userEmail + " NotFoundException");
    }

}