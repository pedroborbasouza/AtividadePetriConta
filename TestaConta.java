public class TestaConta {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Conta conta = new Conta();
        
        if (conta.getNome() == null) {
        System.out.println("Não possui nome.");
            System.out.println("");
        }
        
        conta.setCpf("094.616.619-67");
        conta.setSenha(99074224);
        conta.setSalario(2000.0);
        conta.setNome("Pedro");
        
        System.out.println("CONTA");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Senha: " + conta.getSenha());
        System.out.println("Salário: " + conta.getSalario());
        System.out.println("CPF: " + conta.getCpf());
    }
    
}  
