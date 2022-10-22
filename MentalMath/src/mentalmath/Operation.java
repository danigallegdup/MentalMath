/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalmath;

import java.util.Random;

/**
 * 
 * @author daniela
 */
public class Operation {
    int range =10;
 

    public Operation() { 
    }

  


    public int rand_op(int a, int b, int c) {
        Random rand = new Random();
        int op = rand.nextInt(4) + 1;
        switch (op) {
            case 1:
                return add(a,b,c);
            case 2:
                return sub(a,b,c);
            case 3:
                return mult(a,b,c);
            default:
                return div(a,b,c);
        }

    }

    public int add(int a, int b, int c) {
        int anwser = a + b;
        System.out.print(a + " + " + b + " = ");
        return anwser;
    }

    public int sub(int a, int b, int c) {
        int anwser = a - b;
        System.out.print(a + " - " + b + " = ");
        return anwser;
    }

    public int mult(int a, int b, int c) {
        int anwser = a * b;
        System.out.print(a + " x " + b + " = ");
        return anwser;
    }

    public int div(int a, int b, int c) {
        int d = a * b;
        int anwser = d / b;
        System.out.print(d + " / " + b + " = ");
        return anwser;
    }

}
