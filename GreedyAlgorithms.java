package AlgorithmsAndDataStructures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] stations = {0,250,375,550,750,950};
        System.out.println(minStops(stations,400));
//        int[] array = {3,1,7,9,9,5};
//        System.out.println(maxNumber(array));
    }

//    public static String maxNumber(int[] array){
//       return String.join("",Arrays.stream(array)
//               .boxed()
//               .sorted(Collections.reverseOrder())
//               .map(String::valueOf)
//               .toArray(String[]::new));
//    }
public static int minStops(int[] stations, int capacity){
        int result = 0;
        int currentStop = 0;

        while (currentStop<stations.length-1){
            int nextStop = currentStop;

            while (nextStop<stations.length-1 && stations[nextStop+1]-stations[currentStop]<=capacity)
                nextStop++;

                if (currentStop==nextStop)
                    return -1;

                if (nextStop<stations.length-1)
                result++;

                currentStop = nextStop;


        } return result;

}
}
