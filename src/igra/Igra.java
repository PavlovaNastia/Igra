/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pavlo
 */
public class Igra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5-0+1)+0;
        System.out.println("Программа загадала число от 0 до 5, отгадай: ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if (num == userNum) {
            System.out.println("А ты хорош, угадал!"); }
        else {
            System.out.println("Увы, ты проиграл :(, задумано было число " +num);
        }
        
        
    }
    
}
