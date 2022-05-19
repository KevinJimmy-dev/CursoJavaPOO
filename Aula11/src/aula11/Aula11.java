package aula11;

public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
        /*Visitante v1 = new Visitante();
        v1.setNome("Ueisquen");
        v1.setIdade(34);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Bresquein");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensal();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Leisquen");
        b1.setBolsa(12);
        b1.setSexo("F");
        b1.pagarMensal();
    }
}
