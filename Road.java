import java.util.*;
public class Road 
{
    
    private Station[] stops;
    private Car[] allCars;
    private Passenger[] numPassengers;
        //method to put a road
    /**
     * Road, makes 5 new stops and then put some passengers on the road
     */
    public Road(int myStation, int numP, int numC)
    {
        stops = new Station[myStation];
        for(int i = 0; i < stops.length; i++)
        {
            stops[i] = new Station(i);
        }

        allCars = new Car[numC];
        for(int i = 0; i < allCars.length; i++)
        {
            int start = (int)(Math.random() * myStation);
            int stop = (int)(Math.random() * myStation);
            allCars[i] = new Car(start, stop);
        }

        numPassengers = new Passenger[numP];
        for(int i = 0; i < numPassengers.length; i++)
        {
            int start = (int)(Math.random() * myStation);
            int stop = (int)(Math.random() * myStation);
            Passenger p = new Passenger(start, stop);
            numPassengers[i] = p;
            stops[start].addPass(p);

        }

        
    }

    public void moveCar()
    {
        for(int i = 0; i < 10; i++ )
        {
            
            for(int j = 0; j < stops[allCars[i].getLocation()].getPass().size(); j++ )
            {
                System.out.println(stops[allCars[i].getLocation()]);
                System.out.println(stops[allCars[i].getLocation()].getPass());
                allCars[i].addPassenger(stops[allCars[i].getLocation()], j);
                System.out.println(allCars[i].getPassSize());
            }
            //allCars[i].addPassenger(stops[allCars[i].getLocation()], i);
            

            //method to add passenger into station, ignore null
            for(int k = 0; k <= allCars[i].getPassSize(); k++ )
            {
                if(allCars[i].dropOff() != null)
                {
                    stops[allCars[i].getLocation()].addPass(allCars[i].dropOff());
                }
            }
            allCars[i].move();

            

        }
    }

    public void getStation()
    {
        for(int i = 0; i < stops.length; i++)
        {
            System.out.println(stops[i].getPass());
        }
    }
    
    public void getPassLoc()
    {
        for(int i =0; i < numPassengers.length; i++)
        {
            System.out.println(numPassengers[i].toString());
            System.out.println("");
        }
    }

    public void getStops()
    {
        for(int i = 0; i  < stops.length; i++)
        {
            System.out.println(stops[i].getPass());
            System.out.println("");
        }
    }

    public void getCars()
    {
        for(int i = 0; i < allCars.length; i++)
        {
            System.out.println(allCars[i].toString());
        }
    }

    
    
    
}
