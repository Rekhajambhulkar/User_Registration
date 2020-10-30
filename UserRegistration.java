package com.bridgelabz.userregistration;

public class UserRegistration {

        public static void main(String[] args) {
                System.out.println("Welcome in User Registration program");
		UserRegistration user = new UserRegistration();
		user.firstname();
		user.lastname();
        }

	public boolean firstname() {
		System.out.println("Enter name:");
		String name = sc.next();
		boolean valid = name.matches("^[A-Z][a-z]{3,}");
		System.out.println("First Name is:" + name + "\nvalid: " + valid);
		return valid;

	}

	public boolean lastname() {
		System.out.println("Enter Lastname:");
		String name = sc.next();
		boolean valid = name.matches("^[A-Z][a-z]{3,}");
		System.out.println("Last Name is:" + name + "\nvalid: " + valid);
		return valid;
	}
}

