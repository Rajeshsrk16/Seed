package Demo;

import java.util.Scanner;

public class seed {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the value ");
		int num = scr.nextInt();
		int c = 738;
		int temp = num;
		String s1 = "" + num;
		String s2 = "";
		int len = s1.length();
		int i = 0;
		int n2 = 0;
		int b = 0;
		int n1[] = new int[len];
		while (num > 0) {
			b = num % 10;
			n1[i] = b;
			i++;
			num = num / 10;
		}
		for (int j = 0; j < n1.length; j++) {
			n2 = n2 + temp * n1[j];
		}
		System.out.println(n2);

		if (n2 == c) {
			System.out.println("this is seed");
		} else {
			System.out.println("this is not a seed");
		}

	}
