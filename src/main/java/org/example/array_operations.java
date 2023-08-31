package org.example;
import java.util.Random;
import java.util.Scanner;

/**
  Hanadi Al-shawesh
   443011994
 Data Structure (Lab1)
 Array operations
 */

public class array_operations {


    public static void main(String[] args) {
        Scanner nas = new Scanner(System.in);
        int mainchoice, subchoice;
        int n = 0;
        //randoom
        Random nad = new Random();
        int[] array = new int[20];
        //traversing
        for (int i = 0; i < array.length; i++) {
            array[i] = nad.nextInt(10);
            System.out.print(array[i] + " ");

        }
        System.out.println(" ");
        System.out.println("Please enter the service");
        System.out.println(" 1. Insert an element in the array \n 2. Search for an element and return its index \n 3. Delete an element from the array \n 4. Sort the array \n 5. Remove duplicate elements from the array\n 6. Exit");
        mainchoice = nas.nextInt();

         //Inserting

    if (mainchoice == 1) {
        int[] newarray = new int[array.length + 1];
        int insert;
        System.out.println("Please enter the number");
        insert = nas.nextInt();
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        newarray[array.length] = insert;
        for (int e : newarray)
            System.out.print(e + " ");

        System.out.println(" ");
        System.out.println("do you wanna maore serives?");
        System.out.println(" 1.Insert an element in the array \n 2. Search for an element and return its index \n 3. Delete an element from the array \n 4. Sort the array \n 5. Remove duplicate elements from the array\n 6. Exit");
        mainchoice = nas.nextInt();
      // searching
    } else {
        if (mainchoice == 2) {
            int key;
            System.out.println("please enter the number");
            key = nas.nextInt();
            System.out.println("it's index is " + search(array, key));
        }
    }

        //delete
    if (mainchoice == 3) {
        delete(array);
    }

      //sorting
    if (mainchoice == 4) {
        sort(array);
    }


    //delete deplicate elements
    if (mainchoice == 5) {
        int[] a = sort(array); // 1. sorting tha array
        System.out.println(" ");
        int result[] = new int[a.length]; // inilaize new array
        int k = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) // for example a[i] =3 & a[i+1]=4
                result[k++] = a[i]; // k will be 1
        }
        result[k++] = a[a.length - 1];
        for (int i = 0; i < k; i++) {
            System.out.print(" " + result[i]);
        }
        }

            //exit
        if (mainchoice == 6) {
             nas.close();
        }
    }
              ///Searching

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == key) {
                return i;
            }
        return -1;
    }

              ///Sorting
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                // if the current item is greater than next item, swap them
                if (array[j] > array[j + 1]) {
                    // swap the two items
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

             // Traversing array
        System.out.print("\nArray after sorting: ");
        for (int i = 0; i < array.length; i++)
            if (array[i] != -1) {
               System.out.print(array[i]+" ");
            }
        return array;
    }
              //deleting
    public static int[] delete(int[] array){
        Scanner nas=new Scanner(System.in);
        for (int e : array)
            System.out.print(e + " ");

        if (array.length== 0) {
            System.out.println("Array is empty");
            return array;
        }
        System.out.print("\nEnter the item you want to search: ");
        int key = nas.nextInt();
        boolean isFound = false;
        int index = search(array, key);

        for (int i = 0; i < array.length; i++)
            if (array[i] == key) {
                isFound = true;
                System.out.println("Item " + key + " found at index " + i);

                if (index == -1) {
                    System.out.println("Key not found in the array");
                    return array;
                }
                // delete the key from array
                array[i] = -1;  // assign -1 to delete
                System.out.println("Item " + key + " deleted from index " + i);
                break;
            }

        int[] newarray = new int[array.length];
        int j = 0;
        // If key not found, this code will be executed
        if (isFound == false)
            System.out.println("Item could not be found in the array");

        for (int i = 0; i < array.length; i++) {
            if (i == index) continue;
            newarray[j++] = array[i];
        }
        // Traversing the array to print it
        System.out.print("\nArray after delete: ");
        for (int i = 0; i < array.length; i++)
            if (array[i] != -1)
                System.out.print(array[i] + " ");

        return newarray;
    }


}
