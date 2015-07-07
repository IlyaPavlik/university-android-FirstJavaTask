package com.noveogroup.algorithm;

import java.util.Random;

import com.noveogroup.device.Device;

public class QuickSort implements Algorithm {

	public static final Random RND = new Random();
	
	@Override
	public void sort(Device[] devices, boolean ascendingSort) {
		qsort(devices, 0, devices.length - 1);
	}

	private void qsort(Device[] array, int begin, int end) {
		if (end > begin) {
			int index = partition(array, begin, end);
			qsort(array, begin, index - 1);
			qsort(array, index + 1, end);
		}
	}

	private int partition(Device[] array, int begin, int end) {
		int index = begin + RND.nextInt(end - begin + 1);
		Device pivot = array[index];
		swap(array, index, end);
		for (int i = index = begin; i < end; ++i) {
			if (array[i].compareTo(pivot) <= 0) {
				swap(array, index++, i);
			}
		}
		swap(array, index, end);
		return (index);
	}

	private void swap(Object[] array, int i, int j) {
		Object tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
