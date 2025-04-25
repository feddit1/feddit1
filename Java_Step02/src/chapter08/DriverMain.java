package chapter08;

public class DriverMain {

	public static void main(String[] args) {
		Driver dri = new Driver();
		dri.drive(new Bus());
		dri.drive(new Taxi());
		
		Taxi ta = new Taxi();
		dri.drive(ta);
		ta.run();

	}

}
