/**
 * 
 */
package a4uber;


/**
 * @author emmyww
 *
 */
public class RideRequestImpl implements RideRequest {
	private Position clientPosition;
	private Position destination;
	private boolean isComplete = false;
	private CompletedRide newCompleted;
	
	
	public RideRequestImpl(Position clientPosition, Position destination) {
		this.clientPosition = clientPosition;
		this.destination = destination;
		
		this.getClientPosition();
		this.getDestination();
		this.getIsComplete();
	///	this.getRideTime();
		this.getIsComplete();
	}

	
	public Position getClientPosition() {
		Position client = this.clientPosition;
		if (client == null) {
			throw new RuntimeException("No client pos found");
		} else {
		return client;
	}
	}

	
	public Position getDestination() {
		Position des = this.destination;
		if (des == null) {
			throw new RuntimeException("No destination found");
		} else {
		return des;
	}
	}

	
	public boolean getIsComplete() {
		if (this.isComplete == false) {
			return false;
		}
		return true;
	}

	
	public CompletedRide complete(Driver driver) {
		if (driver == null) {
			throw new RuntimeException ("No driver");
		}
		if (this.getIsComplete() == false) {
			isComplete = true;
			newCompleted = new CompletedRideImpl (this, driver);
		
			Vehicle driverVeh = driver.getVehicle();
			

			Position client = getClientPosition();
			
			driverVeh.moveToPosition(client);
			
			Position destination = getDestination();
			
		
			driverVeh.moveToPosition(destination);
		
			return newCompleted;
		} else {

		return newCompleted;
	}
	}
}
