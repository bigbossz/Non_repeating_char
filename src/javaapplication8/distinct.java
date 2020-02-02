/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author DS-Española
 */
public class distinct {
static final int nochar=256;
String str ="BrandonLee";
static void printdistinct (String str)
{
int[]count = new int[nochar];
int i;
    for ( i = 0; i < str.length(); i++) {
        if (str.charAt(i)!=' ')
            count[(int)str.charAt(i)]++;
        }
    System.out.println("The Distinct characters are:");
    int n=i;
    for (int j = 0;  j< n; j++) {
        if (count[(int)str.charAt(j)]==1) {
            System.out.println(str.charAt(j));
        }
    }
}
  


   void non() {
        
        char inp[] = str.toCharArray();
        System.out.println("Duplicate Character/s are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    break;
                }
            }
        }
        
    }

    
}
