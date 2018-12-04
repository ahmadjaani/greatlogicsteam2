package inheritance;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle vehicle;
		Car car = new Car();
		Bike bike = new Bike();
		vehicle = car;
		vehicle.drive();
	}
}