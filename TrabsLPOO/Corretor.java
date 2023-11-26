public class Corretor extends Pessoa {
    private String creci;

    public Corretor(String nome, String cpf, Endereco endereco, String celular, String creci){
        super(nome, cpf, endereco, celular);
        this.creci = creci;
    }

    public String toString(){
        return "Corretor "+ getNome() + ", de CPF: " + getCpf() + ", localizado no endereço: "+ getEndereco().toString() + ", Número do celular: " + getCelular() + ", com o creci número: " + creci;
    } 
}
