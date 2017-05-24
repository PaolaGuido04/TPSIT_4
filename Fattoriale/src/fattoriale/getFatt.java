/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fattoriale;

/**
 *
 * @author Studente
 */
public class getFatt extends Thread{
    public int fat=1;
    public int x;
    public getFatt(int n){
        this.x=n;
    }
    
    public void run(){
        int i=x;
        while(x>0){
            this.fat=this.fat*this.x;
            x--;
                    }
        System.out.println("il fattoriale di" +i+ "="+fat);
    }
}
