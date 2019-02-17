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
public class soalan3 {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

  int number, sum = 0, count;
  for (count = 1; count <= 5; count++){
  System.out.print("nombor "+count+" :");
       number = input.nextInt();
  sum += number;
  }
  System.out.println("Hasil tambah bagi nombor di atas adalah " + sum);
  
 } 
}
