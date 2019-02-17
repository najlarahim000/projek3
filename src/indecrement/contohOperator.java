/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indecrement;

/**
 *
 * @author pc 12
 */
import java.util.Scanner;
public class contohOperator {
/** Main method */
public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int nom_input, nom_asal, jawapan;
    System.out.print("Masukkan nombor untuk ujian increment & decrement: ");
    nom_input=input.nextInt();
    System.out.println("Nombor yang diamsukkan adalah " +nom_input);
    
    nom_asal=nom_input;
    System.out.println(" ");
    jawapan = ++nom_asal;
    System.out.println("1.Operator Pre-increment nombor asal "
                        +nom_input +" jadi " +nom_asal);
    System.out.println(" dan jawapannya adalah " + jawapan);
    
    nom_asal=nom_input;
    System.out.println("");
    jawapan = nom_asal++;
    System.out.println("2.Operator Post-increment nombor asal "
                         +nom_input +" jadi " +nom_asal);
     System.out.println(" dan jawapannya adalah " + jawapan);
     
     nom_asal=nom_input;
     System.out.println("");
     jawapan = --nom_asal;
     System.out.println("3.Operator Pre-decrement nombor asal "
                         +nom_input +" jadi " +nom_asal);
      System.out.println(" dan jawapannya adalah " + jawapan);
      
     nom_asal=nom_input;
     System.out.println("");
     jawapan = nom_asal--;
     System.out.println("4.Operator Post-decrement nombor asal "
                         +nom_input +" jadi " +nom_asal);
      System.out.println(" dan jawapannya adalah " + jawapan);

     }
   }
