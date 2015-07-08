package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

public class BubbleSort implements Algorithm {

	@Override
	public void sort(Device[] devices, boolean ascendingSort) {

		for (int i = 0; i < devices.length; i++) {
			for (int j = i + 1; j < devices.length; j++) {
				if ((devices[i].compareTo(devices[j]) > 0 && ascendingSort)
						|| (devices[i].compareTo(devices[j]) < 0 && !ascendingSort)) {
					Device t = devices[i];
					devices[i] = devices[j];
					devices[j] = t;
				}
			}
		}
	}

}
