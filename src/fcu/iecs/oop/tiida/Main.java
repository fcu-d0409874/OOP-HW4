package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Keyborad = new Scanner(System.in);
		System.out.print("Please enter a number:");
		int n = Keyborad.nextInt();
		NissanTiida loop = new NissanTiida();
		loop.tiida(n);
		Keyborad.close();
	}
}
