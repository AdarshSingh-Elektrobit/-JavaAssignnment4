package JavaCollections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn4 {

    /*4. Write a Java program to retrieve an element (at a specified index) 
from a given array list. */


    Qn4(){
        ArrayList<String> arrayList = new ArrayList<String>();
        int n;



        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the No of elements you want to put in the list");
        n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
        System.out.println("Enter the "+(i)+"  element");
        String temp= sc.next();
        arrayList.add(temp);
    }

        System.out.println("Enter the index of elements you want to retrive from the list");
        n = sc.nextInt();
        System.out.println("Element retrived: "+arrayList.get(n));
    

    sc.close();

    }
    
}
