/**
 * 
 */
package a4uber;


public class VehicleImpl implements Vehicle {
	private String make;
	private String model;
	private String plate;
	private int mileage =0;
	public Position position;
	
	
	public VehicleImpl (String make, String model, String plate, Position position) { // no mileage in args??
		this.make = make;
		this.model = model;
		this.plate = plate;
		this.position = position; // or is it getPosition() ?
		
		this.getMake();
		this.getModel();
		this.getPlate();
		this.getMileage();
		this.getPosition();
	
		
	}
	// test
	public String getMake() {
		if (this.make == null) {
			throw new RuntimeException("No make found");
		} else {
		// TODO Auto-generated method stub
		return this.make;
	}
	}

	
	public String getModel() {
		if (this.model == null) {
			throw new RuntimeException("No model found");
		} else {
		// TODO Auto-generated method stub
		return this.model;
	}
	}

	
	public String getPlate() {
		if (this.plate == null) {
			throw new RuntimeException("No plate found");
		} else {
		return this.plate;
	}
	}

	
	public int getMileage() {
		return this.mileage;
	}

	
	public Position getPosition() {
		if (this.position == null) {
			throw new RuntimeException("No position found");
		} else {
			return this.position;
		}
//		PositionImpl pos = new PositionImpl (position.getX(), position.getY());
//		return pos;
	}

	
	public void moveToPosition(Position p) {
		// TODO Auto-generated method stub
		/* moveTo(Position p)
		 *    Updates the mileage of the vehicle by adding the Manhattan
		 *    distance between the vehicle's current position and the
		 *    position p passed in as a parameter. Then updates the 
		 *    vehicle's current position to be p.
		 */
		if (this.position == null) {
			throw new RuntimeException("No position found");
		} else {
		
		this.mileage = getMileage() + getPosition().getManhattanDistanceTo(p);
		this.position = p;
	}
	}
}



	


