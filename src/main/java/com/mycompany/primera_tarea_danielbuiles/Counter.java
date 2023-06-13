/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primera_tarea_danielbuiles;

/**
 *
 * @author daniel.builes
 */
public class Counter {

    public static void main(String[] args) {
        System.out.println("Nombre del Archivo: " + args[1] + "Tipo del Arhivo: " + args[0] + "Numero de lineas: " + LineCounter.contar(args[1], args[0]) );
    }
}
