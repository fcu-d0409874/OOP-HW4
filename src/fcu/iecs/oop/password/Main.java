package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Keyborad = new Scanner(System.in);
		System.out.print("Enter password:");
		String input = Keyborad.next();
		PasswordEncorder user = new PasswordEncorder();
		user.encode(input);
		Keyborad.close();

	}

}
