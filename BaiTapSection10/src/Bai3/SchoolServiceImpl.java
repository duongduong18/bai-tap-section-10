package Bai3;

import java.util.Scanner;

public class SchoolServiceImpl implements SchoolService {

	@Override
	public void input(School scs) {
		System.out.println("Thong Tin Truong :");
		System.out.println("---------------------");
		System.out.println("Nhap ID Truong : ");
		scs.setIdSchool(new Scanner(System.in).nextInt());

		System.out.println("Nhap Ten Truong : ");
		scs.setNameSchool(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(School scs) {
		// TODO Auto-generated method stub
System.out.println("Info Truong ");
System.out.println("---------------------");
System.out.println("ID Truong :" + scs.getIdSchool() + "Ten Truong :" + scs.getNameSchool());
	}

}
