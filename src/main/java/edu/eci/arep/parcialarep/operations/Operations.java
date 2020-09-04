/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.parcialarep.operations;

/**
 *
 * @author Andrés Quintero
 */
public class Operations {
    /**
     * Constructor
     */
    public Operations(){

    }
    
    /**
     * 
     * @param arr
     * @return 
     */
    public static double[] ordenar(double[] arr) {
        int longitud = arr.length;
        double temp = 0;
        for(int i=0; i < longitud; i++){
            for(int j=1; j < (longitud-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    /**
     * 
     * @param arr 
     */
    public static void mostrar(double arr[]) {
        double n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}
