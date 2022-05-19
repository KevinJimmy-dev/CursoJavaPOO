package aula12;

public class Aula12 {

    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som de Mamifero
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover(); // Nadando
        p.alimentar(); // Comendo Substancias
        p.emitirSom(); // Peixe nao faz som
        p.soltarBolha();
        
        a.setPeso(0.86f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover(); // Voando
        a.alimentar(); // Comendo frutas
        a.emitirSom(); // Som de Ave
        a.fazerNinho();
        
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
       
       c.setPeso(55.30f);
       c.setIdade(3);
       c.setMembros(4);
       c.locomover(); // Saltando
       c.alimentar(); // Mamando
       c.emitirSom(); // Som de Mamifero
       c.usarBolsa();
       
       k.setPeso(3.94f);
       k.setIdade(5);
       k.setMembros(4);
       k.locomover(); // Correndo
       k.alimentar(); // Mamando
       k.emitirSom(); // Latindo
       k.abanarRabo();
    }
}
