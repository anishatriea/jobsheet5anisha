/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author asus
 */
public class OperatorBitwise {
    public static void main(String[] args ) {
        int x =12;
        int y= 20;
        int z;
        z = x | y;
        System.out.println("Hasil operasi bitwise OR :" +z);
        
        z = x & y;
        System.out.println("Hasil operasi bitwise AND :" + z);
         
        z = x ^ y;
        System.out.println("hasil operasi bitwise OXR :" +z);
        
        z = ~x;
        System.out.println(" hasil opersi bitwise NOT :"+z);
        
        z = x >> 3;
        System.out.println(" hasil oprasi bitwise shift life:" +z);
        
        z = x >> 3;
        System.out.println(" hasil operasi bitwise shift right:" +z);
    }
}
