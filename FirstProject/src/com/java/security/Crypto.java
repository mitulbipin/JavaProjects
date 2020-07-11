package com.java.security;

public class Crypto {
	public static void main(String args[]) {
		BasicCrypto crypto = new BasicCrypto();
		String data = "Mitul Bipin";
		String enc = new String(crypto.encrypt(data.getBytes()));
		String dec = new String(crypto.decrypt(enc.getBytes()));
		
		System.out.println("Original: " +data);
		System.out.println("Encrypted: " +enc);
		System.out.println("Decrpyted: " +dec);
	}
}
