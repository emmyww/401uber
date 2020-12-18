package a4uber;


public class CompletedRideImpl implements CompletedRide {
	private RideRequest request;
	private Driver driver;
	private int waitTime;


	public CompletedRideImpl (RideRequest request, Driver driver) {
		this.request = request;
		this.driver = driver;

		this.getRequest();
		this.getDriver();
		this.getWaitTime();
		waitTime = driver.getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
	}


	public RideRequest getRequest() {
		if (this.request == null) {
			throw new RuntimeException("No request found");
		} else {
			return this.request;
		}
	}

	public Driver getDriver() {
		if (this.driver == null) {
			throw new RuntimeException("No driver found");
		} else {
			return this.driver;
		}
	}


	public int getWaitTime() {
		return waitTime;
	}
}





