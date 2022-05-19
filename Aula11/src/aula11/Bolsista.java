package aula11;

public class Bolsista extends Aluno{
    private int bolsa;

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada do aluno " + this.getNome());
    }
    
    @Override
    public void pagarMensal(){
        System.out.println("Mensalidade do(a) bolsista " + this.getNome() + " paga!");
    }
}
