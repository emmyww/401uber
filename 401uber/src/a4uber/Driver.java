package a4uber;

/*
 * Driver
 * Represents a driver associated with a vehicle.
 * 
 * getFirstName()
 *    Retrieves first name of driver.
 *    
 * getLastName()
 *    Retrieves last name of driver.
 *    
 * getFullName()
 *    Retrieves full name of driver. This should be the first name followed
 *    a single space followed by the last name.
 * 
 * getID()
 *    Retrieves the ID number of the driver.
 *    
 * getVehicle()
 *    Retrieves the Vehicle object associated with the driver.
 *    
 * setVehicle(Vehicle v)
 *    Setter for the vehicle associated with the driver.
 */

public interface Driver {
	String getFirstName();
	String getLastName();
	int getID();
	Vehicle getVehicle();
	void setVehicle(Vehicle v);
	
	
	default String getFullName() {
		if (getFirstName() == null) {
			throw new RuntimeException("No first found");
			
		} else if (getLastName() == null) {
			throw new RuntimeException("No last found");
		} else {
				return getFirstName() + " " + getLastName();
	}
	}
}
