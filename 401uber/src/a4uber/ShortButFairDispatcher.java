/**
 * 
 */
package a4uber;

/**
 * @author emmyw
 *
 */
public class ShortButFairDispatcher implements Dispatcher {
	private int index;
	private Driver[] lastFive;
//	private double [] waiting;
	
	public ShortButFairDispatcher() {
		index =  0;
	}
	
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		int index = 0;
		int closest = request.getClientPosition().getManhattanDistanceTo(availableDrivers[index].getVehicle().getPosition());
		for (int i=1; i < availableDrivers.length; i++) {
			int test = request.getClientPosition().getManhattanDistanceTo(availableDrivers[i].getVehicle().getPosition()); {
				if (test < closest) {
					for (int j=0; j< lastFive.length; j++) {
						if (availableDrivers[i] == lastFive[j]) {
							break;
						}
					}
					closest = test;
					index = i;
				}
			}
		}

		lastFive[4] = lastFive[3];
		lastFive[3] = lastFive[2];
		lastFive[2] = lastFive[1];
		lastFive[1] = lastFive[0];
		lastFive[0] = availableDrivers[index];
		return availableDrivers[index];
	}
}

		
/*This dispatcher should choose the driver that is closest to the client's position but without 
 * considering the last five drivers chosen (you can assume that there will be more than 
 * five available drivers). In other words, if your dispatcher first chooses DriverA,
 *  then the next four times that the dispatcher is asked to choose a driver, DriverA should not be eligible for being chosen.
 */