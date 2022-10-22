/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalmath;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daniela
 */
public class Test {

    private int score = 0;

    public Test() {
        until_death_mult();
    }

    public int rand_int_inrange(int range) {
        Random rand = new Random();
        return rand.nextInt(range) + 2;
    }
    
 /**************************************************
 * learn how to check your answers 
 * 
 ***************************************************/
    
    public void until_death() {
        int range = 10;
        int anwser;
        Scanner sc = new Scanner(System.in);
        //high score so far is 
        int usersAnswer;

        while (true) {
            Operation op = new Operation();
            System.out.print("\n" + (score+1) + ".) ");
            anwser = op.rand_op(rand_int_inrange(range),
                    rand_int_inrange(range) ,rand_int_inrange(range) );
            usersAnswer = sc.nextInt();
            if (usersAnswer == anwser) {
                score++;
                 if (score % 10 == 0) {
                    range = range*2;
                    System.out.println("Level Up");
                  
                }
            } else {
                System.out.println("anwser is " + anwser);
                System.out.println(" your score is " + score);
                break;
            }
        }

    }
    
    public void until_death_add() {
        int range = 10;
        int anwser;
        Scanner sc = new Scanner(System.in);
        //high score so far is 
        int usersAnswer;

        while (true) {
            Operation op = new Operation();
            System.out.print("\n" + (score+1) + ".) ");
            anwser = op.add(rand_int_inrange(range),
                    rand_int_inrange(range) ,rand_int_inrange(range) );
            usersAnswer = sc.nextInt();
            if (usersAnswer == anwser) {
                score++;
                 if (score % 10 == 0) {
                    range = range*2;
                    System.out.println("Level Up");
                  
                }
            } else {
                System.out.println("anwser is " + anwser);
                System.out.println(" your score is " + score);
                break;
            }
        }

    }
    
    public void until_death_sub() {
        int range = 10;
        int anwser;
        Scanner sc = new Scanner(System.in);
        //high score so far is 
        int usersAnswer;

        while (true) {
            Operation op = new Operation();
            System.out.print("\n" + (score+1) + ".) ");
            anwser = op.sub(rand_int_inrange(range),
                    rand_int_inrange(range) ,rand_int_inrange(range) );
            usersAnswer = sc.nextInt();
            if (usersAnswer == anwser) {
                score++;
                 if (score % 10 == 0) {
                    range = range*2;
                    System.out.println("Level Up");
                  
                }
            } else {
                System.out.println("anwser is " + anwser);
                System.out.println(" your score is " + score);
                break;
            }
        }

    }
    
    public void until_death_mult() {
        int range = 10;
        int anwser;
        Scanner sc = new Scanner(System.in);
        //high score so far is 
        int usersAnswer;

        while (true) {
            Operation op = new Operation();
            System.out.print("\n" + (score+1) + ".) ");
            anwser = op.mult(rand_int_inrange(range),
                    rand_int_inrange(range) ,rand_int_inrange(range) );
            usersAnswer = sc.nextInt();
            if (usersAnswer == anwser) {
                score++;
                 if (score % 10 == 0) {
                    range = range*2;
                    System.out.println("Level Up");
                  
                }
            } else {
                System.out.println("anwser is " + anwser);
                System.out.println(" your score is " + score);
                break;
            }
        }

    }
        
    public void until_death_div() {
        int range = 10;
        int anwser;
        Scanner sc = new Scanner(System.in);
        //high score so far is 
        int usersAnswer;

        while (true) {
            Operation op = new Operation();
            System.out.print("\n" + (score+1) + ".) ");
            anwser = op.div(rand_int_inrange(range),
                    rand_int_inrange(range) ,rand_int_inrange(range) );
            usersAnswer = sc.nextInt();
            if (usersAnswer == anwser) {
                score++;
                 if (score % 10 == 0) {
                    range = range*2;
                    System.out.println("Level Up");
                  
                }
            } else {
                System.out.println("anwser is " + anwser);
                System.out.println(" your score is " + score);
                break;
            }
        }

    }
    
 /**************************************************
 * know your accuracy - use this to find your weak points
 * 
 ***************************************************/

    public void percent(){
        System.out.println("");
    }
    
    public void percent_adding() {
        int range = 10;
        int anwser;
        Scanner sc = new Scanner(System.in);
        //high score so far is 
        int usersAnswer;

        while (true) {
            Operation op = new Operation();
            System.out.print("\n" + (score+1) + ".) ");
            anwser = op.add(rand_int_inrange(range),
                    rand_int_inrange(range) ,rand_int_inrange(range) );
            usersAnswer = sc.nextInt();
            if (usersAnswer == anwser) {
                score++;
                 if (score % 10 == 0) {
                    range = range*2;
                    System.out.println("Level Up");
                  
                }
            } else {
                System.out.println("anwser is " + anwser);
                System.out.println(" your score is " + score);
                break;
            }
        }

    }

    public void percent_sub(){
        System.out.println("");
    }
    
    public void percent_mult(){
        System.out.println("");
    }
    
    public void percent_div(){
        System.out.println("");
    }
    
 /**************************************************
 *  Practice your specific parts 
 * 2 y 1, pares, mones, 2 y 2 
 ***************************************************/
    
}
