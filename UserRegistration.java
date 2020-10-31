package com.bridgelabz.userregistration;

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	ArrayList<String> emails = new ArrayList<String>();

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
		System.out.println("\nEmail validation Samples");
		emails.add("abc@abc.com");
		emails.add("abc-100@abc.co.in");
		emails.add("abc111@abc.com");
		emails.add("abc.yz@abc.com.com");
		emails.add("abc#@abc.co.in");
		emails.add("abc@abc.com.com");
		
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		for(String  email : emails){
		    Matcher matcher = pattern.matcher(email);
		    System.out.println(email +" : "+ matcher.matches());
		}
		return regex;
	}
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
		boolean valid = Pass1.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[#@$^+=&%])" 
		+ "(?=\\S+$).{8,}$");
		System.out.println("PassWord is:" + Pass1 + "\nvalid: " +valid);
		System.out.println(valid);

	}
}
