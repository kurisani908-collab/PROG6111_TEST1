package com.mycompany.gamingconsolesreport;

public class GamingConsolesReport {

    public static void main(String[] args) {
        
        // Single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // Single-dimensional array for console types (for headers)
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // Two-dimensional array for sales data
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // 1. Display Gaming Console Report Header and Data
        System.out.println("GAMING CONSOLE REPORT");
        System.out.printf("%-18s%-12s%-12s%-12s%n", "", consoles[0], consoles[1], consoles[2]);
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-12d%-12d%-12d%n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        
        System.out.println("--------------------------------------------------");
        
        // 2. Calculate and Display Totals for Each City
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        
        int maxSales = -1;
        String topCity = "";
        
        for (int i = 0; i < cities.length; i++) {
            int totalCitySales = 0;
            for (int j = 0; j < sales[i].length; j++) {
                totalCitySales += sales[i][j];
            }
            
            System.out.printf("%-18s%d%n", cities[i], totalCitySales);
            
            // Check for the city with the most sales
            if (totalCitySales > maxSales) {
                maxSales = totalCitySales;
                topCity = cities[i];
            }
        }
        
        System.out.println("--------------------------------------------------");
        
        // 3. Display the City with the Most Sales
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
    }
}