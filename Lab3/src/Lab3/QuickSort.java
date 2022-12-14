/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author heynnerherrera
 */
public class QuickSort {
    
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            
            if (arr[j] <= pivot)
            {
                i++;
 
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
       
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
           
            int pi = partition(arr, low, high);
 
            
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
 
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    
    
///“Java program for Quicksort,” GeeksforGeeks, 13-Jun-2022. [Online]. Available: https://www.geeksforgeeks.org/java-program-for-quicksort/. [Accessed: 10-Nov-2022].
}

