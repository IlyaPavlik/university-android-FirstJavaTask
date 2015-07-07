package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

public class InsertionSort implements Algorithm {

	@Override
	public void sort(Device[] devices, boolean ascendingSort) {
		for (int i = 1; i < devices.length; i++) {
			Device currElem = devices[i];
			int prevKey = i - 1;
			while (prevKey >= 0 && devices[prevKey].compareTo(currElem) > 1) {
				devices[prevKey + 1] = devices[prevKey];
				devices[prevKey] = currElem;
				prevKey--;
			}
		}
	}

}
