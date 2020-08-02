package com.java.security;

public interface IEncryptionDeclaration {
	byte[] encrypt(byte[] data);
	byte[] decrypt(byte[] data);

}
