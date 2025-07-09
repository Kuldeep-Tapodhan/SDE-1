/**
 Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

 Example

 There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .

 Function Description

 Complete the migratoryBirds function in the editor below.

 migratoryBirds has the following parameter(s):

 int arr[n]: the types of birds sighted
 Returns

 int: the lowest type id of the most frequently sighted birds
 Input Format

 The first line contains an integer, , the size of .
 The second line describes  as  space-separated integers, each a type number of the bird sighted.
 **/

package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class MigratedBirds {

    public  static  int maxbirds(ArrayList<Integer> arr){
        int n=arr.size();
        int[] frequencyofbird=new int[n];

        for (int x:arr){
            frequencyofbird[x]++;
        }

        int maxindex=0;
        int maxval=0;
        for (int i = 0; i <n ; i++) {
            if (frequencyofbird[i]>maxval){
                maxval=frequencyofbird[i];
                maxindex=i;
            }
        }


        return maxindex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bird sightings: ");
        int n = sc.nextInt();
        ArrayList<Integer> birdSightings = new ArrayList<>();

        System.out.println("Enter bird type IDs (1 to 5):");
        for (int i = 0; i < n; i++) {
            birdSightings.add(sc.nextInt());
        }

        int result = maxbirds(birdSightings);
        System.out.println("Most frequently sighted bird type: " + result);
    }

}
