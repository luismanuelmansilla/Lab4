/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intec.lab4;

/**
 *
 * @author luismanuelmansilla
 */
public class Palindrome {
    
    public static boolean ifPalindrome(String word){

	    int i = word.length()-1;
	    int j=0;
	    while(i > j){
	        if(word.charAt(i) != word.charAt(j)){
	            return false;
	        }
	        i--;
	        j++;
	    }
	    return true;
	}
}
