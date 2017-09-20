/*
 * Rodger Byrd
 * CS 5720 HW1
 * 9/20/17
 * 
 */

import java.io.*;
import java.text.*;
import java.util.*;

public class binarySort {

	public static void main(String[] args) {
		//report time
		long startTime = System.currentTimeMillis();
		int arraySize = 50000;
		
		//create array of random sorted numbers 
		Random rand = new Random();
		int[] sortedArray = new int[arraySize];
		int current = 0;
		int value = 0;

		for (int i = 1; i < arraySize; i++){
			current = current + rand.nextInt(10);
			/*if (i == 0){
				sortedArray[0]= 0;
			}else{
				
			}*/
			sortedArray[i] = current;
		}
		
		
		//for (int i = 0; i < arraySize; i++){
		//	System.out.println(sortedArray[i]);
		//}
		
		//implement binary search algorithm
		int key = rand.nextInt(arraySize);
		int l = 0; //low index
		int h = arraySize-1; //high index
		int m; //median
		int a = -1; //index of match
		
		while (l <= h){
			m = (l + h)/2;
			if (sortedArray[m]==key){
				a = m;
				break;
			}
			else if (key > sortedArray[m]){
				l = m + 1;
			}else{
				h = m - 1;
			}
		}
		//print output to console including whether match was found and total time
		System.out.println("Matching index = "+ a);
		System.out.println("Key = "+ key);
		System.out.println("Array Length = "+ arraySize);

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total runtime = " + totalTime +"ms");
	}
}
