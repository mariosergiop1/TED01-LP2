package atividades;

import java.util.Scanner;

/**
 *
 * @author Mario Sergio
 */
public class Exercicio01 {
    
    Scanner sc = new Scanner(System.in);
    private float valorPag;
    private float valorProd;
    
    public void Ex1(){        
               
        System.out.println("Agora digite o valor do produto: ");
        valorProd = sc.nextFloat();
        
        System.out.println("Digite o valor do pagamento: ");
        valorPag = sc.nextFloat();
        
        if(valorPag >= valorProd){
            
        float troco = valorPag - valorProd;
        System.out.println("O troco a ser dado é: "+troco+" Reais");
        
        }else{
            System.out.println("Por favor, forneça uma valor maior ou igual a "+valorProd);
        }
    }
}
