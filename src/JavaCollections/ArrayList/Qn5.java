package JavaCollections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn5 {

    /*5. Write a Java program to update an array element by the given 
element */
    Qn5(){
        ArrayList arrayList = new ArrayList();
        int n;



        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the No of elements you want to put in the list");
        n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
        System.out.println("Enter the "+(i)+"  element");
        String temp= sc.next();
        arrayList.add(temp);
    }

    System.out.println("The elements entered are: ");

    for (int i = 0; i < n; i++) {
        System.out.println("Element at "+i+"th position:"+arrayList.get(i));
         
    }
    System.out.println("Enter the index of element you want to update in the list");
    int idx = sc.nextInt();

    System.out.println("Enter the value of element you want to update in the list");
    int val = sc.nextInt();

    arrayList.set(idx, val);
    
    System.out.println("Array List Updated.");
    for (int i = 0; i < n; i++) {
        System.out.println("Element at "+i+"th position:"+arrayList.get(i));
         
    }












    
    sc.close();


    }
    
}
