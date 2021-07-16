package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Number n1 = new Number();
        Number n2 = new Number();
        Number res = new Number();

        String opt="Y";

        while(opt.equals("Y")||opt.equals("y")){
            System.out.println("\nType the first number: ");
            n1.setNumber(scan.nextInt());
            System.out.println("\nType the second number: ");
            n2.setNumber(scan.nextInt());

            res.setNumber(n1.getNumber()+n2.getNumber());
            System.out.printf("\nThe sum of %d and %d is %d.\n", n1.getNumber(),n2.getNumber(),res.getNumber());

            System.out.println("Do you want to do another operation? ");
            opt=scan.next();
            /*if(!opt.equals("")){
                c = opt.charAt(0);
            }*/
        }
    }
}
