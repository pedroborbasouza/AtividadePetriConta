public class Conta extends Pessoa {
    private int senha;
    
    public Conta(){
    }
    
    public Conta(String cpf, String nome, double salario, int senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }
    
    public int getSenha(){
        return senha;
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
}
