import java.io.*;
import java.text.*;
import java.util.*;

public class binarySort {

	public static void main(String[] args) {
		//report time
		long startTime = System.currentTimeMillis();
		int arraySize = 10;
		
		//create array of random numbers from 0-100000
		Random rand = new Random();
		int[] sortedArray = new int[arraySize];
		int current = 0;
		for (int i = 0; i < arraySize-1; i++){
				sortedArray[i] = i-1;
		}
		/*
		for (int i = 1; i < 999999; i++){
			current = current + rand.nextInt(5);
			if (i == 0){
				sortedArray[0]= 0;
			}else{
				sortedArray[i] = current + 1;
			}
			current = sortedArray[i];
		}*/
		
		/*
		for (int i = 0; i < 1999; i++){
			System.out.println(sortedArray[i]);
		}
		*/
		//implement binary search algorithm
		int key = rand.nextInt(arraySize);
		int l = 0; //low index
		int h = arraySize-1; //high index
		int m; //median
		int a; //index of match
		
		while (l <= h){
			m = (l + h)/2;
			if (sortedArray[m]==key){
				a = m;
			}
			else if (key > sortedArray[m]){
				l = m + 1;
			}else{
				h = m - 1;
			}
		}
		a  = -1;
		System.out.println("Matching index = "+ a);
		System.out.println("Key = "+ key);

		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total runtime = " + totalTime +"ms");
	}
}
