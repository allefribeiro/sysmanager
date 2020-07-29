package sysmanager;

import java.util.Arrays;

/**
 *
 * @author Allef
 */
public class ContarNumeros {

    // Function to count the elements 
    static int countNumbers( int nunbersArray[], int lessThan) 
    { 
        Arrays.sort(nunbersArray);

        int lengthArray = nunbersArray.length;
        int count = 0;

        for( int i = 0; i < lengthArray; i++) 
        {
            if( nunbersArray[i] < lessThan)
                count = count + 1;
        }

        return count; 
    }

    public static void main( String[] args) 
    {
        int nunbersArray[] = new int[]{ 2, 6, 7, 12, 14, 18 }; 
        int lessThan = 30;

        System.out.println(countNumbers( nunbersArray, lessThan)); 
    }
}
