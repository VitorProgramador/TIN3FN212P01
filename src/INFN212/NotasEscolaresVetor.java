package INFN212;

import java.util.Scanner;

public class NotasEscolaresVetor {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];

        System.out.println("Notas Escolares: ");

        for (int i = 0; i < 4; i++) { //para do Portugol
            do {
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida!");
                }
            } while (validaNota(notas[i]));
            notas[4] += notas[i];

        }//fim do for
        notas[4] = notas[4] / 4;

        System.out.println("Sua média foi de " + notas[4]);
        if (notas[4] >= 7) {
            System.out.println(". Parabéns, você aprovou!");
        } else {
            System.out.println(". Infelizmente, você reprovou!");
        }
    }
    
    public static boolean validaNota(float nota){
        
        
        return nota < 0 || nota> 10;
    }//fim da classe
    
    public static float leiaFloat(){
         try{
         Scanner leia = new Scanner(System.in);
         return leia.nextFloat();
         }catch(Exception e){
             System.out.println("Erro: " + e.getMessage());
             System.out.print("Tente novamente: ");
             return leiaFloat();  
            }
        }
    }


