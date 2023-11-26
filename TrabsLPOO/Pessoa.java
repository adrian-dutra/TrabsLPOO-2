import java.util.Scanner;

abstract class Pessoa implements Verificavel {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String RG;
    private String celular;
    private String dataDeNacimento;

    public Pessoa(String nome, String cpf, Endereco endereco, String celular) {
        this.nome = nome;
        if (validar(cpf) == true) {
            this.cpf = cpf;
        } else {
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
    public boolean validar(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9) {
            primeiroDigito = 0;
        }

        // Verifica o primeiro dígito verificador
        if (Integer.parseInt(String.valueOf(cpf.charAt(9))) != primeiroDigito) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9) {
            segundoDigito = 0;
        }

        // Verifica o segundo dígito verificador
        if (Integer.parseInt(String.valueOf(cpf.charAt(10))) != segundoDigito) {
            return false;
        }

        // Formata o CPF
        return true;
    }

    @Override
    public void solicitaNovo() {
        Scanner r = new Scanner(System.in);
        // define os atributos que serão utilizados, colocando codigoValido como falso
        // para virificação.
        boolean codigoValido = false;
        String novoCodigo = " ";

        // Aqui é solicitado um novo CPF, se for valido o código sai do while.
        while (!codigoValido) {
            System.out.println("Informe um novo CPF:");
            novoCodigo = r.nextLine();
            // Aqui é chamado o método validar, para verificar esse novo CPF.
            codigoValido = validar(novoCodigo);
            // Caso não valide, ele mostra essa mensagem para o usuário.
            if (!codigoValido) {
                System.out.println("CPF inválido. Por favor, tente novamente.");
            }
        }
    }
}