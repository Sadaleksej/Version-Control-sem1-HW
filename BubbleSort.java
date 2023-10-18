import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 8, 1, 2};
        bubbleSort(arr);
}

public static void bubbleSort(int[] arr) {
    Map <Integer, String> ddd34 = new HashMap <> ();
        try {
            FileWriter fileWriter = new FileWriter("log.txt");

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

                Date dd34 = new Date();
        SimpleDateFormat format2;
        format2 = new SimpleDateFormat(
                "yyyy-MM-dd hh:mm");


                

                fileWriter.write(format2.format(d) + " " + arrayToString(arr) + "\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb1 = new StringBuilder();

        sb1.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb1.append(arr[i]);

            if (i != arr.length - 1) {
                sb1.append(", ");
            }
        }
sb1.append("]");

        return sb1.toString();
    }
}