/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author Mario Sergio
 */
public class Exercicio05 {
    
    Scanner sc = new Scanner(System.in);
    
    public void Ex5(){
    
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }        
        }
    }     
}
