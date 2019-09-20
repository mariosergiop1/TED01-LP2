package atividades;

import java.util.Scanner;

/**
 *
 * @author Mario Sergio
 */
public class Exercicio02 {
    
    private float valorQuilo;
    private int QuilosConsumidos;
    
    Scanner sc = new Scanner(System.in);
    
    public void Ex2(){
    
        System.out.println("Informe o valor do quilo: ");
        valorQuilo = sc.nextFloat();
        
        System.out.println("Informe a quantidade de quilos consumidos: ");
        QuilosConsumidos = sc.nextInt();
        
        float precoTotal = valorQuilo * QuilosConsumidos;
    
        
        System.out.println("O valor a ser pago pelos quilos consumidos é R$"+precoTotal+" reais");
    }
}
