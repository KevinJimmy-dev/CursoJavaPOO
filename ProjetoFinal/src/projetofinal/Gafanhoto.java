package projetofinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm(){
        if(this.getLogin() == ""){
            this.setTotAssistido(this.getTotAssistido() + 1);
        } else{
            System.out.println("Usuario nao autenticado!");
        }  
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
}
