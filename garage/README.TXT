Constants:
	private static final int CARGO_CAPACITY = 20; //lbs
	private static final double AVERAGE_SPEED = 47.2; //mph


Motorcycle Constructor Detail

public Motorcycle(int mfgYear,
                  int initMiles,
                  String lic)
  Constructs a motorcycle with a Year of manufacture and an initial number of miles.
  Parameters:
    mfgYear - the year of manufacture
    initMiles - the initial odometer mileage
    lic - a String representing the license plate number

Methods Details

public int deliver(int amount,
                   int dist)
  simulates pickup and delivery of goods
  Overrides:
    deliver in class Vehicle
  Parameters:
    amount - an integer representing the goods to be picked up in pounds
    dist - an integer representing the round trip miles of the delivery
  Returns:
    an integer representing the time it took to complete the trip in minutes

public static int getCapacity()
  A static method to Access the cargo capacity of motorcycles in pounds
  Returns:
    an integer representing the cargo capacity

public void laneSplit()
  This method is unique to the Motorcycle class

public String toString()
  Overrides:
    toString in class java.lang.Object