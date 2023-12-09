package ch13;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		int age;
		System.out.println("나이를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		if(age>=8) {
			System.out.println("학교에 갑니다.");
		}else {
			System.out.println("학교에 가지 않습니다.");
		}
		System.out.println("어린이는 놀아야 합니다.");
	}

}
