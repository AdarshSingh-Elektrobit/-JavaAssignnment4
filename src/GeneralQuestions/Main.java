package GeneralQuestions;

public class Main {
    public static void main(String[] args) {
            Qn1 qn1 = new Qn1(); // Java Program to Create Abstract Class 


            Qn2 qn2 =Qn2.getInstance();//Java Program to Create Singleton Class 
            Qn3 qn3 = new Qn3(); // Java Program to Create an Interface 


            Qn4 qn4= new Qn4(); //Java Program to Show Encapsulation in Class - binding of memeber variables and member functions 




            Qn5 qn5 = new Qn5(); //Java Program to Show Inheritance in Class
            Qn6 qn6 = new Qn6(); //Java Program to Show Abstraction in Class
            Qn7 qn7 = new Qn7(); //Java Program to Show Data Hiding in Class
            //System.out.println(qn7.val); // Error while accessing private memeber
            qn7.getVal();

            Qn8 qn8_1 = new Qn8(2,3);//Java Program to Show Polymorphism in Class 
            Qn8 qn8_2 = new Qn8(2.5f,3.5f);//Java Program to Show Polymorphism in Class 
            

            Qn9 qn9 = new Qn9();//Java Program to Show Overloading of Methods in Class 
            qn9.add(1,2);//Java Program to Show Overloading of Methods in Class 
            qn9.add(1.5f,2.5f);//Java Program to Show Overloading of Methods in Class 

            Qn10 qn10 = new Qn10();
            qn10.sayHello(); //Java Program to Show Overriding of Methods in Classes .

            Qn11 qn11 = new Qn11(); //Java Program to Show Use of Super Keyword in Class 

            Qn12 qn12 = new Qn12(); //Java Program to Show Use of This Keyword in Class 

            Qn13.power(2,3); //Java Program to Show Usage of Static keyword in Class 

            Qn14 qn14 = new Qn14();
            System.out.println(qn14.notHidden); //Java Program to Show Usage of Access Modifier
            // System.out.println(qn14.Hidden);// Error accessing private memeber
            




            




            



        }
    }

    



