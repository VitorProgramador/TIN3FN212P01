/*
 
 */
package INFN212;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class DiasVidaExato {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtNascimento, hoje = LocalDate.now();
        long diasVida;
          
        System.out.println("Calculo de dias de vida exato");
        System.out.println("Informe sua data de nascimento: ");
        dtNascimento = LocalDate.parse(leia.next(),dtf);  
        System.out.println("Data Nasc.: "+ dtf.format(dtNascimento));
        System.out.println("Data Nasc.: "+ dtf.format(hoje));
        diasVida = ChronoUnit.DAYS.between(dtNascimento, hoje);
        System.out.println("Dias de vida exato: " + diasVida);
        
    }
    
}
