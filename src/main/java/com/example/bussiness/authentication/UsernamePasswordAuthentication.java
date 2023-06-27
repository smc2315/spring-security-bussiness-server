package com.example.bussiness.authentication;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class UsernamePasswordAuthentication extends UsernamePasswordAuthenticationToken {

	public UsernamePasswordAuthentication(
		Object principle,
		Object credentials,
		Collection<? extends GrantedAuthority> authorities) {
		super(principle, credentials, authorities);
	}

	public UsernamePasswordAuthentication(Object principal, Object credential) {
		super(principal, credential);
	}
}

