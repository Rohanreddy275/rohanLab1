/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rohanlab1;

import java.util.Scanner;

/**
 *
 * @author rohan
 */
public class salesTax {
    
    public static void main(String[] args) {
        
        //Declaration
         double countryTax = 0.02;
         double stateTax   = 0.04;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the Total amount");
        
        double amount = scn.nextDouble();
        double tStateTax     = amount * stateTax;
        double tCountryTax  = amount * countryTax;
        
        System.out.println("Purchase Amount    "+amount);
        System.out.println("State Sales Tax    "+ tStateTax);
        System.out.println("Country Sales Tax  "+ tCountryTax);
        
        double totalTax = tStateTax + tCountryTax;
        System.out.println("Total Sale Tax     "+ totalTax);
        
        double totalSales = amount + totalTax;
        
        System.out.println("Total amount       " + totalSales);
        
        
    }
    
}
