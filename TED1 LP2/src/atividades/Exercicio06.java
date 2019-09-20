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
public class Exercicio06 {
    
    Scanner sc = new Scanner(System.in);
    private int num;
    
    
    public void Ex6(){
    
        while(num != -1){
            
            System.out.println("Digite um numero para verificarmos se é PAR ou IMPAR: ");
            num = sc.nextInt();

            if(num != -1){
            
                if(num % 2 == 0){
                    System.out.println(num+" é um numero PAR!\n");
                }else{
                    System.out.println(num+" é um numero IMPAR!\n");
                }

                System.out.println("Para finalizar a execução digite -1\n");
                            
            }
        }            
    }    
}
