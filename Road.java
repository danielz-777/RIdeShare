import java.util.*;
public class Road 
{
    final int numStation;
    final int numPass;
    final int numCars;
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
            numPassengers[i] = new Passenger(start, stop);
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

    
    
    
}
