public class Cliente extends Pessoa{
    private int pontuacao;

    public Cliente(String nome, String cpf, Endereco endereco, String celular, int pontuacao){
        super(nome, cpf, endereco, celular);
        this.pontuacao = pontuacao;
    }

    public String toString(){
        return "Cliente "+ getNome() + ", de CPF: " + getCpf() + ", localizado no endereço: "+ getEndereco().toString() + ", Número do celular: " + getCelular() + ", com a pontuação: " + pontuacao;
    } 
}
