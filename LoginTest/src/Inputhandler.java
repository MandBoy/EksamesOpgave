/*
 *Made by Andreas Lind.
 * Used to take input saving us from creating a scanner in every class.
 */

import java.util.Scanner;

public class Inputhandler {
    public static Scanner scanner = new Scanner(System.in);
    public static String strChoice(){
        String str = scanner.next();
        return str;
    }
    public static int intChoice() {
        while(!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
    public static double douChoice() {
        while(!scanner.hasNextDouble()) {
            scanner.next();
        }
        return scanner.nextDouble();
    }
    //Needs physical scanner.
    //We needed to cut this part since tech lounge didn't have an extra scanner we could borrow.
    public static int itemScan(){
        while(!scanner.hasNextInt()){
            scanner.next();
        }
        return scanner.nextInt();
    }
}

