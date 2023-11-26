import java.util.Scanner;
public class ContratoAluguelComercial <U> extends ContratoAluguel <U> implements Verificavel{
    private String razaoSocial;
    private String cnpj;

    public ContratoAluguelComercial(Imovel imovel, Corretor corretor, Cliente cliente, U tempo, double valor, String razaoSocial, String cnpj){
        super(imovel, corretor, cliente, tempo, valor);
        this.razaoSocial = razaoSocial;
        if(validar(cnpj) == true){
            this.cnpj = cnpj;
        }
        else{
            solicitaNovo();
        }
    }

    @Override
    public String toString(){
        return "Contrato de aluguel comercial da corretora: " + razaoSocial + ", de CPNJ: " + cnpj + " " + super.toString();
    }

    @Override
    public boolean validar(String cnpj){
        //tira as pontuações entre os números do CNPJ.
        cnpj = cnpj.replace(".", "").replace("-", "").replace("/", "");
        if (cnpj.length() != 14){
            return false;
        }
        //transforma o CNPJ em um long.
        try {
            Long.parseLong(cnpj);
        } catch (NumberFormatException e){
            return false;
        }

        int[] multiplicadores1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] multiplicadores2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        //Aqui os 12 primeiros números são multiplicados de 5 a 2 e de 9 a 2, sendo alternados.
        int soma = 0;
        for (int i = 0; i < 12; i++){
            //Transforma dígito para String e depois tranforma para int.
            soma += Integer.parseInt(String.valueOf(cnpj.charAt(i))) * multiplicadores1[i];
        }
        //Faz o calculo dividindo por 11 e obtendo o resto para a verificação.
        int resto = soma % 11;
        //Se o resto for menor que 2, o primeiro dígito verificador é 0. Caso o resto seja maior ele será 11 menos resto.
        int digitoVerificador1 = (resto < 2) ? 0 : 11 - resto;
        //Se o primeiro dígito não for igual ao índice 12 do CNPJ, então ele não é valido.
        if (digitoVerificador1 != Integer.parseInt(String.valueOf(cnpj.charAt(12)))){
            return false;
        }
        //Aqui os 13 primeiros números são multiplicados incluindo o primeiro dígito verificador calculado de 5 a 2 e de 9 a 2, sendo alternados.
        soma = 0;
        for (int i = 0; i < 13; i++){
            soma += Integer.parseInt(String.valueOf(cnpj.charAt(i))) * multiplicadores2[i];
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : 11 - resto;
        return digitoVerificador2 == Integer.parseInt(String.valueOf(cnpj.charAt(13)));
    }

    @Override
    public void solicitaNovo(){
        Scanner r = new Scanner(System.in);
        //define os atributos que serão utilizados, colocando codigoValido como falso para verificação.
        boolean codigoValido = false;
        String novoCodigo = " ";

        //Aqui é solicitado um novo CNPJ, se for valido o código sai do while.
        while(!codigoValido){
            System.out.println("Informe um novo CNPJ:");
            novoCodigo = r.nextLine();
            //Aqui é chamado o método validar, para verificar esse novo CNPJ.
            codigoValido = validar(novoCodigo);
            //Caso não valide, ele mostra essa mensagem para o usuário.
            if (!codigoValido){
                System.out.println("CNPJ inválido. Por favor, tente novamente.");
            }
        }
    }
}
