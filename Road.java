import java.util.*;
public class Road 
{
    private Station[] stops;
        //method to put a road
    /**
     * Road, makes 5 new stops and then put some passengers on the road
     */
    public Road()
    {
        stops = new Station[5];
        for(int i = 0; i < stops.length; i++)
        {
            stops[i] = new Station(i);
        }

        stops[0].addPass(new Passenger(0, 3));
        stops[0].addPass(new Passenger(0, 24));
        stops[0].addPass(new Passenger(0, 5));
        stops[0].addPass(new Passenger(0, 9));

        stops[1].addPass(new Passenger(1, 4));
        stops[1].addPass(new Passenger(1, 2));

        stops[2].addPass(new Passenger(2, 3));
        stops[2].addPass(new Passenger(2, 14));

        stops[3].addPass(new Passenger(3, 2));
        stops[3].addPass(new Passenger(3, 7));

        stops[4].addPass(new Passenger(4, 9));
        stops[4].addPass(new Passenger(4, 12));
        
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
