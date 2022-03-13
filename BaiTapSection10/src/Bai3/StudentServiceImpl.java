package Bai3;

import java.util.Scanner;

public class StudentServiceImpl implements StudentService {

	@Override
	public void input(Student sts) {
		// TODO Auto-generated method stub
		System.out.println("Thong Tin Student :");
		System.out.println("---------------------");
		System.out.println("Nhap Name Student : ");
		sts.setName(new Scanner(System.in).nextLine());

		System.out.println("Nhap Tuoi : ");
		sts.setAge(new Scanner(System.in).nextInt());

		School school = new School();
		SchoolServiceImpl scsi = new SchoolServiceImpl();
		scsi.input(school);
		sts.setSchool(school);

		Adress adss = new Adress();
		AdressService adsi = new AdressServiceImpl();
		adsi.input(adss);
		sts.setAdress(adss);
	}

	@Override
	public void info(Student sts) {
		// TODO Auto-generated method stub
		System.out.println("Info Adress ");
		System.out.println("---------------------");
		System.out.println("Student Name :" + sts.getName() + "Student Tuoi :" + sts.getAge());

		SchoolServiceImpl scsi = new SchoolServiceImpl();
		scsi.info(sts.getSchool());//cho no vao ham info cua schoolde doc ra thuoc tinh
//		System.out.println("Truong " + sts.getSchool());//scholl la 1 doi tuong, thi sao la print ra dc

		AdressService adsi = new AdressServiceImpl();
		adsi.info(sts.getAdress());
//		;
//		System.out.println("Dia Chi :" + sts.getAdress());
	}
}