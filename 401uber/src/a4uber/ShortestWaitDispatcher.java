/**
 * 
 */
package a4uber;

/**
 * @author emmyw
 *
 */

public class ShortestWaitDispatcher implements Dispatcher {

	
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		int index = 0;
		int shortest = request.getClientPosition().getManhattanDistanceTo(availableDrivers[index].getVehicle().getPosition());
		for (int i=1; i < availableDrivers.length; i++) {
			int test = request.getClientPosition().getManhattanDistanceTo(availableDrivers[i].getVehicle().getPosition()); {
				if (test < shortest) {
					shortest = test;
					index = i;
				}
			}
		}
		return availableDrivers[index];
	}
}