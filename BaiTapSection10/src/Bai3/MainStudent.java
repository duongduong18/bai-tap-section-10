package Bai3;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentService stService = new StudentServiceImpl();
		
		System.out.println("Nhap so luong");
		int a = new Scanner(System.in).nextInt();
		
		Student[] stArr = new Student[a];
		
		for(int i = 0; i < stArr.length; i++) {
			stArr[i] = new Student();
			stService.input(stArr[i]);
		}
		
		for(Student st : stArr) {
			stService.info(st);
		}
	}

}
