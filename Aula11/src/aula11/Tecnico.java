package aula11;

public class Tecnico extends Aluno{
    private int registroProf;

    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }
    
    public void praticar(){
        System.out.println("Eh o praticas...");
    }
}
