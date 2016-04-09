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
public class main {
    
    public static void main(String args[]){
        long startTime = System.currentTimeMillis();
        Execute e = new Execute();
	Thread t1 = new Thread(e);
	Thread t2 = new Thread(e);
	Thread t3 = new Thread(e);
	Thread t4 = new Thread(e);
        
        try{
            while(Process.cont != Process.fileNames.length){
                t1.run();
                t2.run();
                t3.run();
                t4.run();
            }
        }catch(Exception exc){
        
        }
        
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("\nTotal time: "+ totalTime + " milliseconds");
        
    }
}
