package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

public class InsertionSort implements Algorithm {

	@Override
	public void sort(Device[] devices, boolean ascendingSort) {
		for (int i = 1; i < devices.length; i++) {
			Device temp = devices[i];
			int j = i - 1;
			while (j >= 0 && ((devices[j].compareTo(temp) > 0 && ascendingSort)
					|| (devices[j].compareTo(temp) < 0 && !ascendingSort)))
			{
				devices[j + 1] = devices[j];
				j--;
			}
			devices[j + 1] = temp;
		}
	}

}
