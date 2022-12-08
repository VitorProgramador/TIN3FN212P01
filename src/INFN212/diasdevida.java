package INFN212;

import java.time.LocalDate;
import java.util.Scanner;

public class diasdevida {

   
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int idade, diasVida;
        
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        
        diasVida = 365*idade;
        System.out.println("Você já viveu " + diasVida + "dias de vida aproximadamente!");
        
        LocalDate dtNasc, dtAtual = LocalDate.now();
        System.out.println(dtAtual);
        

        
    }
    
}
