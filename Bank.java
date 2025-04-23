public class Bank {
 
    int balance;

    //data type --> 
    //boolean {true,false}
    //byte  {1 2 4 5 }
    //short 
    //char 
    //int 
    //long 
    //float 
    //double 

    //non primitive 
        //class
        //array 
        //object 
        //enum

    void getData(){
        System.out.println("getData");
    }

    void printData(){
        System.out.println("printData");
    }
 
    public static void main(String[] args) {
        
        //how to create object? 

        java.util.Scanner scr=  null;
        Bank obj = new Bank(); 
        obj.getData();
        obj.printData();
        
    }
}
