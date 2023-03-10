package io.pello.refactorings.magicnumbers.refactored;

import java.util.Random;

/**
 * Magic Numbers This class is intended to be used as a refactoring playground
 * 
 * @author PELLO_ALTADILL
 */
public class PasswordGenerator {
	private Random random = new Random();
	private String characters = "abcdefghijkmnopqrstuvwxyz23456789";

	public String generatePassword(int length) throws Exception {
		if (length < MIN_PASSWORD_LENGTH || length > MAX_PASSWORD_LENGTH) {
			throw new Exception("Wrong password length: " + length);
		} else {
			String password = "";

			for (int i = 0; i < length; i++)
				password += characters.charAt(random.nextInt(characters.length()));

			return password;
		}
	}
    public static final int MAX_PASSWORD_LENGTH = 15;
    public static final int MIN_PASSWORD_LENGTH = 6;
}
