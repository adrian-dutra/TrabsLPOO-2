public class TipoImovel {
    private String tipo;

    public TipoImovel(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString(){
        return "Imovel do tipo: " + tipo;
    }

    public int compareTo(TipoImovel tipo2) {
        return 0;
    }
}
