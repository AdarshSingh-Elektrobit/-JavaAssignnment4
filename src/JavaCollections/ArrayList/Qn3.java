package JavaCollections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Qn3 {

    public ArrayList arrayList = new ArrayList();
    int n;
    Qn3() {
    
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the to be put in the first index of the list");
    n = sc.nextInt();
    arrayList.add(0, n);
    System.out.println(arrayList.getFirst());
    

    }
    
    
    
    
}
