package JavaCollections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn2 {

    /*2. Write a Java program to iterate through all elements in an array list. */

    static ArrayList<String> arrayList = new ArrayList<String>();
    int n;
    Qn2() {
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the No of elements you want to put in the list");
    n = sc.nextInt();
    
    for (int i = 0; i < n; i++) {
        
        System.out.println("Enter the "+(i+1)+"  colour");
        String temp= sc.next();
        arrayList.add(temp);
    }
    sc.close();

    }
    
    
    public void iterate(){
        for (int i = 0; i < n; i++) {
            System.out.println(arrayList.get(i));
             
        }
    }
    
}
