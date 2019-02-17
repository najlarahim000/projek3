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
public class soalan2 {
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      int bil, sifir;
      
      System.out.print("Sifir berapa? - ");
      sifir=input.nextInt();
      for (bil=1; bil<=10; bil++){
            System.out.println(bil + " x " + sifir + " : " + (bil*sifir));
         }
      }
    }
