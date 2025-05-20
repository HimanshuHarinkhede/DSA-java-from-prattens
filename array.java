import java.util.*;
public class array{
    public static void main(String[]args){
       /* 
       //for linearSearch
       int num[] = {2, 4, 3, 10, 34, 53, 342};
        int key = 3;
        System.out.println(linearSearch(num, key));
        */

        /*
       //largest Number search
       int num[] ={43, 54, 64, 25, 34, 4};
       
       System.out.println("The largest no. is " + largestNum(num));

       */

      //smallest number search

      int num[] = { 43, 34, 54, 13, 98, 5, 34, 99};
      System.out.println(SmallestNum("the smallest number is" + num));

    }

    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }


public static int largestNum(int num[]){
    int largest = Integer.MIN_VALUE;
    for(int i =0; i<num.length; i++){
        if(num[i]>largest){
            largest = num[i];
        }
    }
    return largest;
}


public static int SmallestNum(int num[]){
    int Smaller = Integer.MAX_VALUE;
    
    for(int i=0; i<num.length; i++){
        if(num[i] < Smaller){
            Smaller = num[i];
        }
    }
    return Smaller;
}
}