package INFN212;

import java.util.Scanner;

public class DesafioSextaVariavel {

    public static void main(String[] args) {
        
        int contNotas;
        Scanner leia = new Scanner(System.in);
        contNotas = leiaInt();
        float notas[] = new float[contNotas];
        int media = contNotas;
        
        System.out.println("Notas Escolares: ");

        for (int i = 0; i < contNotas; i++) { //para do Portugol
            do {
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida!");
                }
            } while (validaNota(notas[i]));
            notas[contNotas] += notas[i];

        }//fim do for
        notas[contNotas] = notas.length / media;

        System.out.println("Sua média foi de " + notas[contNotas]);
        if (notas[contNotas] >= 7) {
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
