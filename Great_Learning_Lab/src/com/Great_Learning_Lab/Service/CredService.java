package com.Great_Learning_Lab.Service;

import java.util.Random;

import com.Great_Learning_Lab.model.Employee;

public class CredService {


	public char[] generatedPassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();

		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;
	}

	public String generatedEmail(String firstName, String lastName, String department) {
		return firstName + lastName  + "@" + department + "greatlearning.com";

	}

	public void showCredentials(Employee employee, String email, char[] password) {
		System.out.println("\n Employee: " + employee.getFirstName());
		System.out.println("\n Email: " + email);
		System.out.println("\n Password: " + String.valueOf(password));
	}

}