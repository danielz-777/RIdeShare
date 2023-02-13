import java.util.*;
public class Car 
{
    private int revenue;
    private ArrayList<Passenger> pass;
    private int maxPass;
    private int location;
    private int destination;
    private static int rev;
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
        maxPass = 4;
    }

    public void addPassenger(Station s, int i)
    {
        
        if(destination > location)
        {
            if(s.getPass(i).getDestination() < destination && s.getPass(i).getDestination() > location && maxPass < 4)
            {
                pass.add(s.getPass(i));
            }
        }
        if(location > destination)
        {
            if(s.getPass(i).getDestination() > destination && s.getPass(i).getDestination() < location && maxPass < 4)
            {
                pass.add(s.getPass(i));
            }
        }
        
    }

    public int getLocation()
    {
        return location;
    }

    public void move()
    {
        if(pass.size() == 0)
        {
            if(location < destination)
            {
                location++;
                rev += pass.size();
            }
            

            if(location > destination)
            {
                location--;
                rev += pass.size();
            }
        }
        
        if(destination > location)
        {  
            location++;
        }

        if(location > destination)
        {  
            location--;
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
