package com.example.hash;

import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

public class GuavaExample {
	public static void main(String args[]) {
		String beforeHash = "Aline Akaki";
		String sha256hex = Hashing.sha256()
				  .hashString(beforeHash, StandardCharsets.UTF_8)
				  .toString();
		
		System.out.println("Exemplo de SHA-256 utilizando Guava >>> " + sha256hex);	
	}
}
