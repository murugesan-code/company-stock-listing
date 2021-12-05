package com.stock.jwt;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtUtil implements Serializable {

	private String SECRET_KEY = "secret";
	
	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
	
	public String getUsernameFromTOken(String token) {
		return getClaimFromToken(token,Claims::getSubject);
	}
	
	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token, Claims::getExpiration);
	}

	public <T> T getClaimFromToken(String token, Function<Claims,T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
	}

	private Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
	}
	
	private Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	public String generateToken(UserDetails userDetails) {
		Map<String,Object> claims = new HashMap<>();
		return doGenerateToken(claims,userDetails.getUsername());
	}

	private String doGenerateToken(Map<String, Object> claims, String username) {
		
		return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(new Date(System.currentTimeMillis()))
				.signWith(SignatureAlgorithm.HS512, SECRET_KEY).compact();
	}
	
	public Boolean validateToken(String token,UserDetails userDetails) {
		final String userName = getUsernameFromTOken(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	
	

}
