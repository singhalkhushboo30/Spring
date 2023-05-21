package com.jwt.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


	@Service
	public class CustomerUserDetailsService implements UserDetailsService {

	    @Override
	    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	        
	    	if(userName.equals("Mahi"))
	    		{
	    		return new User("Mahi","Mahi",new ArrayList<>());
	    		}
	    	else {
	    		throw new UsernameNotFoundException("User not found !!");
	    	}
	       
	    }
	}


