/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primera_tarea_danielbuiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author daniel.builes
 */
public class LineCounter {

    public static int contar(String arg, String LineType) {
        
        Path file = Paths.get(arg);
        
        int LineasContadas = 0;
        
        try (InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                LineasContadas =  LineasContadas + 1;
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        
       
        
        return LineasContadas;
    }
    
}
