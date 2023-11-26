public class Proprietario extends Pessoa{
    private String pix;

    public Proprietario(String nome, String cpf, Endereco endereco, String celular, String pix){
        super(nome, cpf, endereco, celular);
        this.pix = pix;
    }

    public String toString(){
        return "Proprietario "+ getNome() + ", de CPF: " + getCpf() + ", localizado no endereço: "+ getEndereco() + ", Número do celular: " + getCelular() + ", PIX: " + pix;
    } 
}
