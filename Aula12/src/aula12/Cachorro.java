package aula12;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom(){
        System.out.println("Latindo...");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando o Osso...");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo...");
    }
}
