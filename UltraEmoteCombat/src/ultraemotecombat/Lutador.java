package ultraemotecombat;

public class Lutador {
    private String nome, nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        if(this.peso < 52.2){
            this.categoria = "Invalido";
            
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
            
        } else if(this.peso <= 83.9){
            this.categoria = "Medio";
            
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
            
        } else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public void apresentar(){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Veeem ae, o lutador peso " + this.getCategoria() + ", com " + this.getPeso() + " Kgs, de nacionalidade " 
                + this.getNacionalidade() + ", com " + this.getIdade() + " anos, com " + this.getAltura() + " de altura. Com " 
                + this.getVitorias() + " vitorias, com " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates. Com voces o monstro " + this.getNome());
        System.out.println("--------------------------------------------------------------------------");
    }
    
    public void status(){
        System.out.println("--------------------------------");
        System.out.print(this.getNome());
        System.out.println(" eh um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("--------------------------------");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
