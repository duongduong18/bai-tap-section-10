package Bai2;

import java.util.Scanner;

public class LaptopServiceImpl implements LaptopService {

	@Override
	public void input(Laptop lt) {
		System.out.println("LapTop input :");
		System.out.println("Nhap ID :");
		lt.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap Ram :");
		lt.setRam(new Scanner(System.in).nextInt());
		System.out.println("Nhap VGA :");
		lt.setVga(new Scanner(System.in).nextLine());
		System.out.println("Nhap CPU :");
		lt.setCpu(new Scanner(System.in).nextLine());
	}

	@Override
	public void info(Laptop lt) {
		System.out.println("Laptop Info");
		System.out.println("-------------");
		System.out.println(
				"ID Laptop :" + lt.getId() + "RAM :" + lt.getRam() + "CPU :" + lt.getCpu() + " VGA :" + lt.getVga());

	}

}
