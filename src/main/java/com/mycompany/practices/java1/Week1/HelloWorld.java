/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practices.java1.Week1;

import edu.duke.*;
import java.nio.file.Paths;

public class HelloWorld {

    public static void main(String[] args) {
        FileResource res = new FileResource(Paths.get("").toAbsolutePath().toString() + "\\src\\main\\java\\com\\mycompany\\practices\\java1\\Week1\\hello_unicode.txt");
        for (String line : res.lines()) {
            System.out.println(line);
        }
        //System.out.println(Paths.get("").toAbsolutePath().toString());
    }
}
