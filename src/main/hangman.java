package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hangman {


    public static void main(String[] args) {
        System.out.println("Enter the secret word");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer word; //its immutable
        try {
            word = new StringBuffer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
