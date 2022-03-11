package Bai2;

public class MainLaptop {

	public static void main(String[] args) {
		LaptopServiceImpl lap = new LaptopServiceImpl();
		Laptop laptop = new Laptop();
		LaptopServiceImpl laptopp = new LaptopServiceImpl();
		laptopp.input(laptop);
		laptopp.info(laptop);
	}

}
