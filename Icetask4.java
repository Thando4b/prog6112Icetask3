/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask4;

/**
 *
 * @author Thando
 */
public class Icetask4 {

    public static void main(String[] args) {
        //Create an array of products
        Product[] products = new Product[4];
        Clothing[] product = null;
        product[0] = new Clothing("T-Shirt", 200);
        product[1] = new Clothing("Jeans", 500);
        product[2] = new Electronis("Headphones");
        products[3] = new Electronics("Laptop", 15000);
        
        //Print discounted prices
        for (Product p : products) {
            System.out.println(p.getName() + "- Original: R" + p.getPrice() + "| Discounted; R" + p.getDiscountedPrice());
        }
    }

    private static class Electronis {

        public Electronis(Electronics i) {
        }

        private Electronis(String headphones, int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
