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

		School school = new School();
		SchoolServiceImpl scsi = new SchoolServiceImpl();
		scsi.info(school);
		sts.getSchool();
		System.out.println("Truong " + sts.getSchool());

		Adress adss = new Adress();
		AdressService adsi = new AdressServiceImpl();
		adsi.info(adss);
		sts.getAdress();
		System.out.println("Dia Chi :" + sts.getAdress());
	}
}