package com.example.hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;

public class BouncyCastleExample {
	public static void main(String args[]) {
		String beforeHash = "Aline Akaki";
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] hash = digest.digest(
				beforeHash.getBytes(StandardCharsets.UTF_8));
		String sha256hex = new String(Hex.encode(hash));
		
		System.out.println("Exemplo de SHA-256 utilizando Bouncy Castle >>> " + sha256hex);	
	}
}
