/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFN212;
//área de import que equivale ao inclua do portugol

import java.util.Scanner;

/**
 *
 * @author 182120036
 */
public class NotasAlunos {//equivale ao progama do portugol
//equivale a área de declaração de variável global
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//equivale a função inicio no portugol
        // TODO code application logic here
        //equivale a área de declaração de variável local
        Scanner leia = new Scanner(System.in);//equivale ao leia do portugol
        float nota1, nota2, nota3, nota4, media;
        
        System.out.println("Notas Escolares");//equivale ao escreva do portugol
        System.out.print("Informe a 1ª nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Informe a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Informe a 4ª nota: ");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Média: " + media);
        System.out.printf("Média: %.2f"  ,media);
        System.out.println("");
    }
    
}