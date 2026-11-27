package com.mycompany.cabudlay_methodactivity;

public class Cabudlay_MethodActivity {
    
    
        static int calculator(int x, int y) { 
        return x + y;
        }
        
        static double calculator(double x, double y, char operator) { 
        switch (operator) {
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                System.out.println("Invalid Operator!!!");
                return 0.0;
                  
        }
      
            
        }

    public static void main(String[] args) {
        System.out.println("The Sum is: " + calculator(11,11));
        System.out.println("The Difference is: " + calculator(11.0, 11.0, '-'));
        System.out.println("The Product is: " + calculator(11.0, 11.0, '*'));
        System.out.println("The Quotient is: " + calculator(11.0,11.0,'/'));
        System.out.println("Reymar Igop");
    }

}
