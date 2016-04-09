/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intec.lab4;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author luismanuelmansilla
 */
public class Filter implements FilenameFilter{

        @Override
	public boolean accept(File dir, String name) {
		//return name.matches(".+(\\.txt)");
                return name.endsWith(".txt");
        }
}