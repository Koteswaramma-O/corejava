class VehicalModel {
	void detilasOfVehical() {
		System.out.println("Vehical model ");
	}
}
class Car extends VehicalModel {
	int noOf_tyres = 4;
	String vehical_Model = "Ford";

	void detilasOfVehical() {
		System.out.println("NoOfTyres :" + noOf_tyres + "\n" + "vehival_model :" + vehical_Model);
	}
}
class Bike extends VehicalModel {
	int noOf_tyres = 2;
	String vehical_Model = "SUZUKI";

	void detilasOfVehical() {
		System.out.println("NoOfTyres :" + noOf_tyres + "\n" + "vehival_model :" + vehical_Model);
	}
}
public class Heirarchical {
	public static void main(String[] args) {
	System.out.println("Car Details :");
		Car carobj = new Car();
		carobj.detilasOfVehical();
		System.out.println();
		System.out.println("Bike details :");
		Bike bikeobj = new Bike();
		bikeobj.detilasOfVehical();
	}
}
