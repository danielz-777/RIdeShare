public class Passenger
{
    //lowest level file for RideShare project
    //contains Passenger's desired destination and current location

    private int destination;
    private int location;

    public Passenger(int myLocation, int myDestination)
    {
        destination = myDestination;
        location = myLocation;
    }

    //get destination 
    public int getDestination()
    {
        return destination;
    }

    //get location;
    public int getLocation()
    {
        return location;
    }

    public String toString()
    {
        return super.toString() + " Start : " + location + " Dest: " + destination;
    }

    

}