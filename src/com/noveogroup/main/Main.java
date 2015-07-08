package com.noveogroup.main;

import java.util.Arrays;

import com.noveogroup.algorithm.Algorithm;
import com.noveogroup.algorithm.BubbleSort;
import com.noveogroup.algorithm.InsertionSort;
import com.noveogroup.algorithm.QuickSort;
import com.noveogroup.device.MobileDevice;
import com.noveogroup.device.Notebook;
import com.noveogroup.device.Phone;
import com.noveogroup.device.Tablet;

public class Main {

	public static void main(String[] args) {
		MobileDevice[] devices = new MobileDevice[] { 
				new Notebook(1234),
				new Phone(8567), 
				new Tablet(7890),
				new Notebook(256)};

		System.out.println("---Source array---");
		System.out.println(Arrays.toString(devices));
		System.out.println("------------------");
		System.out.println();
		
		printSorting(new BubbleSort(), devices);
		printSorting(new InsertionSort(), devices);
		printSorting(new QuickSort(), devices);
	}
	
	private static void printSorting(Algorithm algorithm, MobileDevice[] devices){
		System.out.println("---" + algorithm.getClass().getSimpleName() + "---");
		
		algorithm.sort(devices, true);
		System.out.println("Ascending");
		System.out.println(Arrays.toString(devices));
		
		algorithm.sort(devices, false);
		System.out.println("Descending");
		System.out.println(Arrays.toString(devices));
		System.out.println();		
	}
}
