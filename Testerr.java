import java.util.Scanner;

import javax.crypto.spec.PBEKeySpec;

public class Testerr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        // array object
        System.out.println("Masukkan jumlah object: ");
        int object = in.nextInt();
        product[] p = new PBEKeySpecroduct[object];

        //loop
        for (int i = 0; i < p.length; i++) {
            System.out.println("Name: ");
            String name = in.next();
            System.out.println("Number: ");
            int number = in.nextInt();
            System.out.println("quantity: ");
            int quantity = in.nextInt();
            System.out.println("Price :");
            double price = in.nextDouble();
            p[i] = new product(number, name, quantity, price);
            p[i].print();
            
        }

        p[1] = new product();

        CD[] c = new CD[5];
        c[4] = new CD();



    }
}