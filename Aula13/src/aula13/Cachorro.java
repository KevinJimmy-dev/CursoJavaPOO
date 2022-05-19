package aula13;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if("Toma Comida".equals(frase) || "cheguei".equals(frase)){
            System.out.println("*Abanando e latindo*");
        } else{
            System.out.println("*rosnando*");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanando...");
        } else if(hora >= 18){
            System.out.println("Ignorando...");
        } else{
            System.out.println("Abanando e latindo...");
        }   
    }
    
    public void reagir(boolean dono){
       if(dono){
           System.out.println("Abanando....");
       } else{
           System.out.println("rosnando e latindo...");
       }
    }
    
    public void reagir(int idade, float peso){
        if (idade  < 5) {
            if (peso < 10) {
                System.out.println("Abanando...");
            } else {
                System.out.println("Latindo...");
            }
        } else {
            if(peso < 10){
                System.out.println("rosnando...");
            } else{
                System.out.println("Ignorando...");
            }
        }
    }
}
