/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_1_test;

/**
 *
 * @author emeris
 */
public class Question_1_Test {

    public static void main(String[] args) {
        
        String cities[] = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        int [][] twoDimensionalArray = { {1000,2000,3000}, {2000,3000,4000}, {1500,1100,1200}};
        
        int[] cityTotals = new int[cities.length];
        
        int maxSales = -1;
        String topCity = "";
        
         for(int row = 0; row < twoDimensionalArray.length; row++) {
            int rowTotal = 0;
            for(int col = 0; col < twoDimensionalArray.length; col++) {
                rowTotal += twoDimensionalArray[row][col];
            }
            cityTotals[row] = rowTotal;
            
            if(rowTotal > maxSales) {
                rowTotal = maxSales;
                topCity = cities[row];
            }
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");
        
        System.out.println("PS5 XBOX SWITCH");
       
    }
}
