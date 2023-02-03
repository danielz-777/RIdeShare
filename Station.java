import java.util.*;
public class Station 
{
    //station for car

    //int from 0-31, where station is located on each mile
    private int location;

    private ArrayList<Passenger> numPass;

    public Station()
    {
        location = (int)(Math.random() * 31);
        
    }

    //adding Passenger to station
    public void addPass(Passenger p)
    {
        numPass.add(p);
    }

    //removing Passenger from station, can have a list be accessed by a car to determine best passenger to travel
    public void removePass()
    {
        //nothing for me, can change later
    }
}
