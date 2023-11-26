public class ContratoAluguel <T>{
    private Imovel imovel;
    private Corretor corretor;
    private Cliente cliente;
    private T tempo;
    private double valor;

    public ContratoAluguel(Imovel imovel, Corretor corretor, Cliente cliente, T tempo, double valor){
        this.imovel = imovel;
        this.corretor = corretor;
        this.cliente = cliente;
        this.tempo = tempo;
        this.valor = valor;
    }

    public T getTempo() {
        return tempo;
    }

    public double getValor() {
        return valor;
    }

    double calcularComissao(){
        return valor * 0.1;
    }

    @Override
    public String toString(){
        return "Contrato do: " + imovel + ", corretor: " + corretor + ", cliente: " + cliente + ", pelo tempo de: " + tempo + ", ao valor de R$" + String.format("%.2f", valor) + ". Com um valor de comissão de: " + String.format("%.2f", calcularComissao()) + ". Ao corretor: " + corretor;
    }
}
