package com.Great_Learning_Lab.Controller;

import java.util.Scanner;

import com.Great_Learning_Lab.Service.CredService;
import com.Great_Learning_Lab.model.*;

public class Controller {
	public static void main(String[] args) {

		Employee employee = new Employee("MANDAR", "PAWAR");

		CredService credentialService = new CredService();
		String generatedEmail;

		char[] generatedPassword;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("\n Please enter options: ");

			System.out.println("\n 1. Technical\n 2. Admin \n 3. Human Resource \n 4. Legal");

			int option = scanner.nextInt();

			switch (option) {
			case 1:

				generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "tech.");

				generatedPassword = credentialService.generatedPassword();

				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;

			case 2:
				generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "admin.");

				generatedPassword = credentialService.generatedPassword();

				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;

			case 3:
				generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getFirstName(), "hr.");

				generatedPassword = credentialService.generatedPassword();

				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;
				
			case 4:
				generatedEmail = credentialService.generatedEmail(employee.getFirstName(), employee.getLastName(), "legal.");

				generatedPassword = credentialService.generatedPassword();

				credentialService.showCredentials(employee, generatedEmail, generatedPassword);
				break;		

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
}
