/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intec.lab4;
import static com.intec.lab4.Palindrome.ifPalindrome;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author luismanuelmansilla
 */
public class Process {
    static File directorio = new File(".");
    static String[] fileNames = directorio.list(new Filter());
    static int[] numPalindrome = new int[fileNames.length];
    static int cont = 0;
    
    public static void runProcess() throws FileNotFoundException, IOException {
            
            String line;
            FileReader f = new FileReader(fileNames[cont]);
            BufferedReader b = new BufferedReader(f);

            while((line = b.readLine())!=null) {
                    if(ifPalindrome(line)){
                        numPalindrome[cont]++;
                    }
            }
            b.close();
            
            System.out.println(fileNames[cont] + " has: " + Integer.toString(numPalindrome[cont]) + " palindromes");
            cont++;
    }
    
}
    
