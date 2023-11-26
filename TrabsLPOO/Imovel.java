public class Imovel implements Comparable<Imovel>{
    private TipoImovel tipo;
    private Endereco endereco;
    private double area;
    private double preco;
    private Proprietario proprietario;

    public Imovel(TipoImovel tipo, Endereco endereco, double area, double preco, Proprietario proprietario){
        this.tipo = tipo;
        this.endereco = endereco;
        this.area = area;
        this.preco = preco;
        this.proprietario = proprietario;
    }

    public TipoImovel getTipo() {
        return tipo;
    }

    @Override
    public int compareTo(Imovel outroImovel) {
        return this.tipo.compareTo(outroImovel.tipo);
    }

    @Override
    public String toString(){
        return "Tipo do Imóvel: " + tipo + ", localizado no endereço: " + endereco + ", de área: " + String.format("%.2f", area) + ", avaliado no valor de R$" + String.format("%.2f", preco) + ", proprietário: " + proprietario;
    }
}
