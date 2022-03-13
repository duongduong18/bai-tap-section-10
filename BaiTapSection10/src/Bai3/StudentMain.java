package Bai3;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		StudentServiceImpl stsi = new StudentServiceImpl();
		stsi.input(std);
		stsi.info(std);
		
	}

}
