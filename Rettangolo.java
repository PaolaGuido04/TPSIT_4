/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rettangolo;
import java.util.Scanner;
/**
 *
 * @author Studente
 */
public class Rettangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci base");
        int base = input.nextInt();
        System.out.println("inserisci altezza");
        int altezza = input.nextInt();
        int area = base * altezza;
        System.out.println("area= "+ area);
        int perimetro =(base+altezza)*2;
        System.out.println("perimetro="+perimetro);
        
        // TODO code application logic here
    }
    
}
