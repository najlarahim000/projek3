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
public class soalan1 {
public static void main(String[] args){
    
    Scanner taip = new Scanner(System.in);
    System.out.print("Taip satu perkataan: ");
    String perkataan = taip.next();
    int length = perkataan.length();
    char aksara = perkataan.charAt(0);
    char[] taip_aksara = perkataan.toCharArray();
    
    
    for(int i=0; i < length; i++){
        for(int j=0; j <= i ; j++){
    System.out.print(taip_aksara[j]);
    }
        System.out.println("");
    }
  }
 }
