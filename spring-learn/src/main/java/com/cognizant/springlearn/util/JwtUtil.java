package com.cognizant.springlearn.util;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {

    private static final SecretKey SECRET_KEY =
            Keys.hmacShaKeyFor(
                    "ThisIsASecretKeyForJwtGeneration123456789".getBytes());

    public String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .signWith(SECRET_KEY)
                .compact();
    }

    public String validateToken(String token) {

        Claims claims = Jwts.parser()
                .verifyWith(SECRET_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();

        return claims.getSubject();
    }
}