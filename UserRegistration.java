package com.bridgelabz.userregistration;

public class UserRegistration {

        public static void main(String[] args) {
                System.out.println("Welcome in User Registration program");
		UserRegistration user = new UserRegistration();
		user.firstname();
		user.lastname();
		user.emailId();
		user.MobileNo();
		user.passWord();
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

	public boolean emailId() {
		System.out.println("Enter EmailId:");
		String email = sc.next();
		boolean valid = email.matches( "^[a-zA-Z0-9+_.-]+@(.+)$");
		System.out.println("email Id is:" + email + "\nvalid: " + valid);
		return valid;
	}

	//Function for MobileNo validation
	public void MobileNo() {
		System.out.println("Enter MobileNo :");
		String MobileNo = sc.next();
		boolean valid = MobileNo.matches( "^(\\d{2})\\-([6-9]{1}\\d{9})$" );
		System.out.println("MobileNo is:" + MobileNo + "\nvalid: " + valid);
		System.out.println(valid);
	}

	//Function for Password validation
	public void passWord() {
		System.out.println("Enter PassWord:");
		String Pass1 = sc.next();
		boolean valid = Pass1.matches("^[a-zA-Z0-9]{8,}");
		System.out.println("PassWord is:" + Pass1 + "\nvalid: " +valid);
		System.out.println(valid);

	}
}
