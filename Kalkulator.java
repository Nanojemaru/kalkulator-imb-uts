/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

import java.util.Scanner;
public class Kalkulator {

  
    public static void main(String[] args) {
         
        //klasifikasi variabel
        Scanner input = new Scanner (System.in);
        int beratbadan;
        float tinggibadan;
        double BMI;
        
        
        // 
        System.out.println("PERHITUNGAN BERAT BADAN");
        System.out.println("------------------------");
        
        
       System.out.println("TAMBAHKAN BERAT BADAN");
       beratbadan = input.nextInt();
        
       System.out.println("TAMBAHKAN TINGGI BADAN");
       tinggibadan = input.nextInt();
       
       tinggibadan/=100;
       BMI= beratbadan/(tinggibadan*tinggibadan);
       System.out.println("BMI yang di hitung " + BMI);
       
       if (BMI >28){
         System.out.println("kegemukan");  
       }
        if (BMI <24){
         System.out.println("gemuk");  
       
       }
         if (BMI >18){
         System.out.println("normal");  
       
       }
          if (BMI <18){
         System.out.println("kurus atau kecil");  
       
       }
           
    }
       
}
    

