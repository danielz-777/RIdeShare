import java.util.*;
public class Station 
{
    //station for car

    //int from 0-31, where station is located on each mile
    private int location;

    private ArrayList<Passenger> numPass;

    public Station(int num)
    {
        location = num;
        numPass = new ArrayList<Passenger>();
    }

    //return all Passengers in station
    public ArrayList getPass()
    {
        return numPass;
    }

    public void removePass(int i)
    {
        numPass.remove(i);
    }

    public Passenger getPass(int i)
    {
        return numPass.get(i);
    }

    

    //get station location
    public int getLocation()
    {
        return location;
    }

    //adding Passenger to station
    public void addPass(Passenger p)
    {
        numPass.add(p);
    }

    //removing Passenger from station, can have a list be accessed by a car to determine best passenger to travel
    /**
     * 
     * @return the next Passenger going left or null if there is none
     */
    public Passenger nextLeftPass()
    {
        for(int i = 0; i < numPass.size(); i++)
        {
            Passenger p = numPass.get(i);
            if(p.getDestination() < location)
            {
                numPass.remove(i);
                return p;
            }
        }
        return null;
    }

    
}
