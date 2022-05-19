package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo a programar", "Seu Ze", 30, p[0]);
        l[1] = new Livro("POO para iniciantes", "Dona Ma", 60, p[1]);
        l[2] = new Livro("Algoritmo", "Seu Ze", 100, p[0]);
        
        l[0].abrir();
        l[0].folhear(20);
        l[0].avancarPag();
        l[0].detalhes();
    }
    
}
