package Bai3;

import java.util.Scanner;

public class AdressServiceImpl implements AdressService {

	@Override
	public void input(Adress ads) {
		// TODO Auto-generated method stub
		System.out.println("Thong Tin Adress :");
		System.out.println("---------------------");
		System.out.println("Nhap ID Adress : ");
		ads.setIdAdress(new Scanner(System.in).nextInt());
		System.out.println("Nhap Street : ");
		ads.setStreet(new Scanner(System.in).nextLine());
		System.out.println("Nhap City : ");
		ads.setCity(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Adress ads) {
		// TODO Auto-generated method stub
		System.out.println("Info Adress ");
		System.out.println("---------------------");
		System.out.println(
				"ID Adress :" + ads.getIdAdress() + "Ten Street :" + ads.getStreet() + "Ten City" + ads.getCity());
	}

}
