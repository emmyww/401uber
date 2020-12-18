package a4uber;


public class DriverImpl implements Driver {
	private String first;
	private String last;
	private int id;
	private Vehicle vehicle;

	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		this.first = first;
		this.last = last;
		this.id = id;
		this.vehicle = vehicle;

		this.getFirstName();
		this.getLastName();
		this.getFullName();
		this.getID();
		this.getVehicle();
		this.setVehicle(vehicle);


	}

	@Override
	public String getFirstName() {
		if (this.first == null) {
			throw new RuntimeException("No first name found");
		} else {
			return first;
		}
	}

	@Override
	public String getLastName() {
		if (this.last == null) {
			throw new RuntimeException("No last name found");
		} else {
			return last;
		}
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public Vehicle getVehicle() {
		if (this.vehicle == null) {
			throw new RuntimeException("No vehicle found");
		} else {
			return this.vehicle;
		}
	}

	@Override
	public void setVehicle(Vehicle v) {
		if (getVehicle() == null) {
			throw new RuntimeException("No vehicle found");
		} else if (v == null) {
			throw new RuntimeException("No vehicle found");
		} else {
			this.vehicle = v;

		}
	}
}

