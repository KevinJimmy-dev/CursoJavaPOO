package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoConta) {
        this.tipo = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if(t == "CC"){
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        
        System.out.println("Parabens! A sua conta foi aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
            
            System.out.println("Sua conta foi fechada com sucesso!");
        } else if(this.getSaldo() < 0){
            System.out.println("Erro! Voce esta devendo R$" + this.getSaldo() + " reais na conta, pague para fecha-la!");
        } else{
            System.out.println("Erro! Voce possui R$" + this.getSaldo() + " reais na conta, retire para fecha-la!");
        }
    }
    
    public void depositar(float deposito){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + deposito);
            
            System.out.println("Deposito de R$" + deposito + " feito com sucesso na conta de " + this.getDono() + "!");
        } else{
            System.out.println("Erro! Abra a sua conta para depositar!");
        }
    }
    
    public void sacar(float saque){
        if(this.getStatus()){
            if(this.getSaldo() >= saque){
                this.setSaldo(this.getSaldo() - saque);
                
                System.out.println("Saque de R$" + saque + " feito com sucesso na conta de " + this.getDono() + "!");
            } else{
                System.out.println("Erro! Valor de saque invalido!");
            }
        } else{
            System.out.println("Erro! Abra sua conta para sacar!");
        }
    }
    
    public void pagarMensal(){
        if(this.getStatus()){
            if(this.saldo > 20){
               if(this.getTipo() == "CC"){
                    this.setSaldo(this.getSaldo() - 12);
                
                    System.out.println("A sua mensalidade de R$12,00 foi paga!");
                } else{
                    this.setSaldo(this.getSaldo() - 20);
                
                    System.out.println("A sua mensalidade de R$20,00 foi paga!");
                } 
            } else{
                System.out.println("Erro! Valor insuficiente para pagar mensalidade!");
            }
        } else{
            System.out.println("Erro! Abra sua conta para pagar a mensalidade!");
        }
    }
    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------");
    }
}
