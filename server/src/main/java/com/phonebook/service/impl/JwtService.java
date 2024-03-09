package com.phonebook.service.impl;

import com.phonebook.service.IJwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.security.PrivateKey;
import java.util.function.Function;

@Service
public class JwtService implements IJwtService {

    private static  final String SECRET_KEY = "iu0gT9yHWDhttKHpQ6dNRo3kfqsiE5wl";
    @Override
    public String getUsername(String jwt) {
        String userName = "";

        return userName;
    }

    @Override
    public String getPasswordHash(String jwt) {
        return null;
    }

//    private <T>T getClaim(String token, Function<Claims, T> claimsResolver){
//
//    }

    private Claims extractClaims(String token){
        return Jwts
                .parser()
                .decryptWith(getSignInKey())
                .build()
                .parseEncryptedClaims(token)
                .getPayload();
    }

    private SecretKey getSignInKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
