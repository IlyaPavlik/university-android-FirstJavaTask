package com.noveogroup.algorithm;

import java.util.Random;

import com.noveogroup.device.Device;

public class QuickSort implements Algorithm {

	public static final Random RND = new Random();
	private boolean ascendingSort;
	
	@Override
	public void sort(Device[] devices, boolean ascendingSort) {
		this.ascendingSort = ascendingSort;
		qsort(devices, 0, devices.length - 1);
	}

	private void qsort(Device[] devices, int begin, int end) {
		if (end > begin) {
			int index = partition(devices, begin, end);
			qsort(devices, begin, index - 1);
			qsort(devices, index + 1, end);
		}
	}

	private int partition(Device[] devices, int begin, int end) {
		int index = begin + RND.nextInt(end - begin + 1);
		Device currElem = devices[index];
		swap(devices, index, end);
		for (int i = index = begin; i < end; ++i) {
			if ((devices[i].compareTo(currElem) < 0 && ascendingSort)
					|| (devices[i].compareTo(currElem) > 0 && !ascendingSort)) {
				swap(devices, index++, i);
			}
		}
		swap(devices, index, end);
		return (index);
	}

	private void swap(Object[] devices, int i, int j) {
		Object tmp = devices[i];
		devices[i] = devices[j];
		devices[j] = tmp;
	}
}
