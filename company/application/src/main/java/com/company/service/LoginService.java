package com.company.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.company.api.LoginApi;
import com.company.jwt.CompanyUserDetails;
import com.company.jwt.JwtUtil;
import com.company.model.Credentials;
import com.company.model.Token;

import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;

@RestController
@Service
@Slf4j
@CrossOrigin
public class LoginService implements LoginApi {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private CompanyUserDetails companyUserDetails;

	@Autowired
	JwtUtil jwtUtil;

	@Override
	public ResponseEntity<Token> getAccessToken(@Valid Credentials credentials) {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword()));
		} catch (BadCredentialsException e) {
			//log.error("Incorrect username or password", e);
		}
		final UserDetails userDetails = companyUserDetails.loadUserByUsername(credentials.getUsername());
		final String jwt = jwtUtil.generateToken(userDetails);
		Token token = new Token();
		token.setToken("Bearer "+jwt);
		return ResponseEntity.ok(token);
	}

}
