import java.util.Scanner;
abstract class Pessoa implements Verificavel{
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String RG;
    private String celular;
    private String dataDeNacimento;

    public Pessoa(String nome, String cpf, Endereco endereco, String celular){
        this.nome = nome;
        if(validar(cpf) == true){
            this.cpf = cpf;
        }
        else{
            solicitaNovo();
        }
        this.endereco = endereco;
        this.celular = celular;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getCelular() {
        return celular;
    }
    
    @Override
    public boolean validar(String cpf){
        //tira as pontuações entre os números do CPF.
        cpf = cpf.replace(".", "").replace("-", "");
        //Verifica o tamanho do CPF.
        if (cpf.length() != 11){
            return false;
        }
        //tranforma o CPF de String para long.
        try {
            Long.parseLong(cpf);
        } catch (NumberFormatException e){
            return false;
        }

        int[] multiplicadores = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        //Aqui se faz a soma dos multiplicadores
        int soma = 0;
        for (int i = 0; i < 9; i++){
            //Transforma dígito para String e depois tranforma para int.
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * multiplicadores[i];
        }

        //Faz o calculo dividindo por 11 e obtendo o resto para a verificação.
        int resto = soma % 11;
        //Se o resto for menor que 2, o primeiro dígito verificador é 0. Caso o resto seja maior ele será 11 menos resto.
        int digitoVerificador1 = (resto < 2) ? 0 : 11 - resto;
        //Se o primeiro dígito não for igual ao índice 9 do CPF, então ele não é valido.
        if (digitoVerificador1 != Integer.parseInt(String.valueOf(cpf.charAt(9)))){
            return false;
        }
        //Aqui segue a mesma lógica do primeiro.
        soma = 0;
        for (int i = 0; i < 10; i++){
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * multiplicadores[i];
        }
        resto = soma % 11;
        int digitoVerificador2 = (resto < 2) ? 0 : 11 - resto;
        //Se o segundo dígito vverificador for igual ao índice 10 do CPF, ele é valido e retorna true.
        return digitoVerificador2 == Integer.parseInt(String.valueOf(cpf.charAt(10)));
    }    
    
     @Override
    public void solicitaNovo(){
        Scanner r = new Scanner(System.in);
        //define os atributos que serão utilizados, colocando codigoValido como falso para virificação.
        boolean codigoValido = false;
        String novoCodigo = " ";

        //Aqui é solicitado um novo CPF, se for valido o código sai do while.
        while(!codigoValido){
            System.out.println("Informe um novo CPF:");
            novoCodigo = r.nextLine();
            //Aqui é chamado o método validar, para verificar esse novo CPF.
            codigoValido = validar(novoCodigo);
            //Caso não valide, ele mostra essa mensagem para o usuário.
            if (!codigoValido){
                System.out.println("CPF inválido. Por favor, tente novamente.");
            }
        }
    }
}