/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INFN212;

import java.util.Scanner;

/**100
 *
 * @author 182120036
 */
public class VendaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leia = new Scanner(System.in);//equivale ao leia do portugol
        float custfab, custdist, imp, valorconsu; 
        
        System.out.println("Sistema de Vendas Veicular");//equivale ao escreva do portugol
        System.out.print("\nCusto de Fabrica: ");
        custfab = leia.nextFloat();
        custdist = (float) (custfab * 0.28);
        imp = (float) (custfab * 0.45);
        valorconsu = (float) (custdist + custfab + imp);
        System.out.printf("Valor de Venda: %.2f"  ,valorconsu);
        System.out.println("");
    }
    
}