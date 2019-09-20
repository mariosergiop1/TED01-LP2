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
public class Exercicio03 {
    
    
    private int num;
    Scanner sc = new Scanner(System.in);
    
    
    public void Ex3(){
    
        System.out.println("Digite um numero para identificarmos se é PAR ou IMPAR: ");
        num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num+" é um numero PAR!");
        }else{
            System.out.println(num+" é um numero IMPAR!");
        }
    }
}
