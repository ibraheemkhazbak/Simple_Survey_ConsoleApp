package com.khazbak;

import java.util.Scanner;

public class AnswerGrabber {
private static Scanner scan=new Scanner(System.in);

    public static boolean getBoolean(String message) {
        char ansChar;

        boolean answer;
        while (true) {
            ansChar=scan.next().charAt(0);
            scan.nextLine();
            if(ansChar=='y'||ansChar=='Y'){
                answer=true;
                break;
            }else if(ansChar=='n'||ansChar=='N') {
                answer=false;
                break;
            }
            System.out.println("Please enter (y/n)");
        }

    return answer;
    }
}
