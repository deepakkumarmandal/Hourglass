/* Program to find the maximum sum of an Hourglass in a 6x6 Matrix*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int count=-27,c=-27,sum1=0,sum2=0,sum3=0,i,j;
        for(i=0; i < 6; i++){
            for(j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(i=0;i<=3;i++)
        {
            for(j=0;j<=3;j++)
            {  
                sum1=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum2=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                sum3=arr[i+1][j+1];
                count=sum1+sum2+sum3;
                
                if(c<=count)
                {
                    c=count;
                }
            }
        }
        
        System.out.print(c);
        
        
    }
}
