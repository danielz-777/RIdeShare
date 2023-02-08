import java.util.*;
public class Car 
{
    private int revenue;
    private ArrayList<Passenger> pass;
    private int maxPass;
    private int location;
    private int destination;
    //private boolean isLeft;

    public Car(int myLocation, int myDestination)
    {
        location = myLocation;
        destination = myDestination;
        pass = new ArrayList<Passenger>();
        /* 
        if(Math.random() < 0.50)
        {
            isLeft = true;
        }*/
    }

    public void addPassenger(Passenger p)
    {
        
        pass.add(p);
    }

    public int getLocation()
    {
        return location;
    }

    public void move()
    {
        for(int i = 0; i <= pass.size(); i++)
        {
            if(destination > location)
            {
                if(pass.get(i).getDestination() <= destination && pass.get(i).getDestination() >= location)
                {
                    location = pass.get(i).getDestination();
                }
            }

            if(location > destination)
            {
                if(pass.get(i).getDestination() >= destination && pass.get(i).getDestination() <= location)
                {
                    location = pass.get(i).getDestination();
                }
            }
            
        }

        
        
    }

    public void dropOff()
    {
        for(int i = 0; i < pass.size(); i++)
        {
            if(location == pass.get(i).getDestination())
            {
                pass.remove(pass.get(i));
                i--;
            }
        }
    }

}
