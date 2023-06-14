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

    public static int contar(String arg, String FileType) {
        
        Path file = Paths.get(arg);
        
        int LineasContadas = 0;
        
        try (InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in))) 
        {
            String line = null;
            while ((line = reader.readLine()) != null) {
                FileType.strip();
                
                if ("phy".equals(FileType)){
                    LineasContadas =  LineasContadas + 1;
                }
                
                else{
                    String Nline = line.stripLeading();
                    
                    if(Nline.length() == 1){
                        
                        char result = Nline.charAt(0);
                        String compare = String.valueOf(result);
                        if("/".equals(compare) || "*".equals(compare) || "".equals(compare) || "\n".equals(compare) || " ".equals(compare)){
                            
                        }else{
                            LineasContadas =  LineasContadas + 1;
                        }
                        
                    }
                    
                    else if(Nline.length() != 0){
                        String compare = Nline.substring(0,2);
                        

                        if("//".equals(compare) || "**".equals(compare) || "".equals(compare) || "\n".equals(compare) || "/*".equals(compare)  || "*/".equals(compare) || " ".equals(compare) || "* ".equals(compare)) {
                                
                        }else{
                            LineasContadas =  LineasContadas + 1;
                        }
                    } 
                }
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        
        return LineasContadas;
    }
}
