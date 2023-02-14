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

    //adding Passengers method
    public void addPassenger(Station s, int i)
    {
        
        if(destination > location)
        {
            if(s.getPass().size() > 0)
            {
                if(s.getPass(i).getDestination() < destination && s.getPass(i).getDestination() > location && pass.size() <= maxPass)
                {
                    
                    pass.add(s.removePass(i));
                    //System.out.println(pass);
                }
            }
            
        }
        if(location > destination)
        {
            if(s.getPass().size() > 0)
            {
                if(s.getPass(i).getDestination() > destination && s.getPass(i).getDestination() < location && pass.size() <= maxPass)
                {
                    
                    pass.add(s.removePass(i));
                    //System.out.println(pass);
                }
            }
            
        }
        
        
        
    }

    //rev variable is to get miles of function, the standard rev is $5 per mile
    public int getMiles()
    {
        return rev;
    }

    public int getPassSize()
    {
        return pass.size();
    }

    public int getLocation()
    {
        return location;
    }

    public int getDest()
    {
        return destination;
    }
    public void move()
    {
        
       
        
        if(destination > location)
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

    public Passenger dropOff()
    {
        for(int i = 0; i < pass.size(); i++)
        {
                if(location == pass.get(i).getDestination())
                {
                    return pass.remove(i);
                }
        }
        return null;
        
    }

    public String toString()
    {
        return super.toString() + " current location: " + location + " Dest: " + destination + " size: " + pass.size();
    }

}
