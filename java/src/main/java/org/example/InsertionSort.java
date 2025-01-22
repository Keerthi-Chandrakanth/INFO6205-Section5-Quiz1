package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }
 
    private void insert(int i, Comparable[] a) {
    int j = i;
    while (j > 0 && a[j - 1].compareTo(a[j]) > 0) {
        swap(a, j - 1, j);
        j--;
    }
}

 
    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
}
