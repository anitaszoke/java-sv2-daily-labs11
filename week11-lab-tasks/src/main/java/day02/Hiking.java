package day02;

import java.util.List;

public class Hiking {

   public double getPlusElevation(List<Double> elevations) {
       double sum = 0.0;

       for (int i= 1; i < elevations.size(); i++) {
           if(elevations.get(i) > elevations.get(i-1)) {
               sum += (elevations.get(i)-elevations.get(i-1));
           }
       }
       return sum;
    }
}
