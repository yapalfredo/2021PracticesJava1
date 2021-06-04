/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practices.java1.Week1;
import edu.duke.*;
/**
 *
 * @author al
 */
public class HelloWorld {
    public void runHello(){
        FileResource res = new FileResource("hello_unicode.txt");
        for (String line : res.lines()){
         System.out.println(line);
        }
    }
}
