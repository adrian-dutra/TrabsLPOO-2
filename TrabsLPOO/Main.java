import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);

        List<Imovel> imoveisDisponiveis = new ArrayList<>();
        List<Imovel> imoveisManutencao = new ArrayList<>();
        List<String> informacoesCliente = new ArrayList<>();
        List<String> informacoesProprietario = new ArrayList<>();
        List<String> informacoesCorretor = new ArrayList<>();
        List<String> contratos = new ArrayList<>();



        try{
            System.out.println("Dígite 3 endereços completos, na ordem de Rua, número, bairro, cidade.");
            System.out.println("Endereço 1: ");
            String rua1 = r.nextLine();
            int numero1 = r.nextInt();
            r.nextLine(); 
            String bairro1 = r.nextLine();
            String cidade1 = r.nextLine();
            String cep1 = r.nextLine();
            Endereco endereco1 = new Endereco(rua1, numero1, bairro1, cidade1, cep1);

            System.out.println("Endereço 2: ");
            String rua2 = r.nextLine();
            int numero2 = r.nextInt();
            r.nextLine(); 
            String bairro2 = r.nextLine();
            String cidade2 = r.nextLine();
            String cep2 = r.nextLine();
            Endereco endereco2 = new Endereco(rua2, numero2, bairro2, cidade2, cep2);

            System.out.println("Endereço 3: ");
            String rua3 = r.nextLine();
            int numero3 = r.nextInt();
            r.nextLine(); 
            String bairro3 = r.nextLine();
            String cidade3 = r.nextLine();
            String cep3 = r.nextLine();
            Endereco endereco3 = new Endereco(rua3, numero3, bairro3, cidade3, cep3);


            System.out.println("Digite 3 endereços sem o CEP, na ordem de Rua, número, bairro, cidade.");
            System.out.println("Endereço 4: ");
            String rua4 = r.nextLine();
            int numero4 = r.nextInt();
            r.nextLine(); 
            String bairro4 = r.nextLine();
            String cidade4 = r.nextLine();
            Endereco endereco4 = new Endereco(rua4, numero4, bairro4, cidade4);

            System.out.println("Endereço 5: ");
            String rua5 = r.nextLine();
            int numero5 = r.nextInt();
            r.nextLine(); 
            String bairro5 = r.nextLine();
            String cidade5 = r.nextLine();
            Endereco endereco5 = new Endereco(rua5, numero5, bairro5, cidade5);

            System.out.println("Endereço 6: ");
            String rua6 = r.nextLine();
            int numero6 = r.nextInt();
            r.nextLine(); 
            String bairro6 = r.nextLine();
            String cidade6 = r.nextLine();
            Endereco endereco6 = new Endereco(rua6, numero6, bairro6, cidade6);
            
            TipoImovel tipo1 = new TipoImovel("Terreno");
            TipoImovel tipo2 = new TipoImovel("Casa");
            TipoImovel tipo3 = new TipoImovel("Apartamento");
            TipoImovel tipo4 = new TipoImovel("Comércio");


            System.out.println("Digite informações de 4 clientes, na ordem: nome, cpf, celular, pontuação. ");
            System.out.println("Cliente 1: ");
            String nome1 = r.nextLine();
            String cpf1 = r.nextLine();
            Endereco enderecoCliente1 = endereco1; 
            String celular1 = r.nextLine();
            int pontuacao1 = r.nextInt();
            Cliente cliente1 = new Cliente(nome1, cpf1, enderecoCliente1, celular1, pontuacao1);
            informacoesCliente.add(cliente1.toString());

            r.nextLine();

            System.out.println("Cliente 2: ");
            String nome2 = r.nextLine();
            String cpf2 = r.nextLine();
            Endereco enderecoCliente2 = endereco2;
            String celular2 = r.nextLine();
            int pontuacao2 = r.nextInt();
            Cliente cliente2 = new Cliente(nome2, cpf2, enderecoCliente2, celular2, pontuacao2);
            informacoesCliente.add(cliente2.toString());

            r.nextLine();

            System.out.println("Cliente 3: ");
            String nome3 = r.nextLine();
            String cpf3 = r.nextLine();
            Endereco enderecoCliente3 = endereco3; 
            String celular3 = r.nextLine();
            int pontuacao3 = r.nextInt();
            Cliente cliente3 = new Cliente(nome3, cpf3, enderecoCliente3, celular3, pontuacao3);
            informacoesCliente.add(cliente3.toString());

            r.nextLine();

            System.out.println("Cliente 4: ");
            String nome4 = r.nextLine();
            String cpf4 = r.nextLine();
            Endereco enderecoCliente4 = endereco4; 
            String celular4 = r.nextLine();
            int pontuacao4 = r.nextInt();
            Cliente cliente4 = new Cliente(nome4, cpf4, enderecoCliente4, celular4, pontuacao4);
            informacoesCliente.add(cliente4.toString());

            //Aqui eu pego as informações de proprietários e coloco na lista de informações.
            System.out.println("Digite informações de 6 proprietários, na ordem: nome, cpf, celular, pix.");
            System.out.println("Proprietário 1: ");
            String nomeProprietario1 = r.nextLine();
            String cpfProprietario1 = r.nextLine();
            Endereco enderecoProprietario1 = endereco1;
            String celularProprietario1 = r.nextLine();
            String pixProprietario1 = r.nextLine();
            Proprietario proprietario1 = new Proprietario(nomeProprietario1, cpfProprietario1, enderecoProprietario1, celularProprietario1, pixProprietario1);
            informacoesProprietario.add(proprietario1.toString());

            r.nextLine();

            System.out.println("Proprietário 2: ");
            String nomeProprietario2 = r.nextLine();
            String cpfProprietario2 = r.nextLine();
            Endereco enderecoProprietario2 = endereco2; 
            String celularProprietario2 = r.nextLine();
            String pixProprietario2 = r.nextLine();
            Proprietario proprietario2 = new Proprietario(nomeProprietario2, cpfProprietario2, enderecoProprietario2, celularProprietario2, pixProprietario2);
            informacoesProprietario.add(proprietario2.toString());

            r.nextLine();

            System.out.println("Proprietário 3: ");
            String nomeProprietario3 = r.nextLine();
            String cpfProprietario3 = r.nextLine();
            Endereco enderecoProprietario3 = endereco3; 
            String celularProprietario3 = r.nextLine();
            String pixProprietario3 = r.nextLine();
            Proprietario proprietario3 = new Proprietario(nomeProprietario3, cpfProprietario3, enderecoProprietario3, celularProprietario3, pixProprietario3);
            informacoesProprietario.add(proprietario3.toString());

            r.nextLine();

            System.out.println("Proprietário 4: ");
            String nomeProprietario4 = r.nextLine();
            String cpfProprietario4 = r.nextLine();
            Endereco enderecoProprietario4 = endereco4; 
            String celularProprietario4 = r.nextLine();
            String pixProprietario4 = r.nextLine();
            Proprietario proprietario4 = new Proprietario(nomeProprietario4, cpfProprietario4, enderecoProprietario4, celularProprietario4, pixProprietario4);
            informacoesProprietario.add(proprietario4.toString());

            r.nextLine();

            System.out.println("Proprietário 5: ");
            String nomeProprietario5 = r.nextLine();
            String cpfProprietario5 = r.nextLine();
            Endereco enderecoProprietario5 = endereco5; 
            String celularProprietario5 = r.nextLine();
            String pixProprietario5 = r.nextLine();
            Proprietario proprietario5 = new Proprietario(nomeProprietario5, cpfProprietario5, enderecoProprietario5, celularProprietario5, pixProprietario5);
            informacoesProprietario.add(proprietario5.toString());

            r.nextLine();

            System.out.println("Proprietário 6: ");
            String nomeProprietario6 = r.nextLine();
            String cpfProprietario6 = r.nextLine();
            Endereco enderecoProprietario6 = endereco6; 
            String celularProprietario6 = r.nextLine();
            String pixProprietario6 = r.nextLine();
            Proprietario proprietario6 = new Proprietario(nomeProprietario6, cpfProprietario6, enderecoProprietario6, celularProprietario6, pixProprietario6);
            informacoesProprietario.add(proprietario6.toString());


            //Aqui eu pego as informações de corretores e coloco na lista de informacões.
            System.out.println("Digite informações de 3 corretores, na ordem: nome, cpf, celular, creci.");
            System.out.println("Corretor 1: ");
            String nomeCorretor1 = r.nextLine();
            String cpfCorretor1 = r.nextLine();
            Endereco enderecoCorretor1 = endereco4; 
            String celularCorretor1 = r.nextLine();
            String creciCorretor1 = r.nextLine();
            Corretor corretor1 = new Corretor(nomeCorretor1, cpfCorretor1, enderecoCorretor1, celularCorretor1, creciCorretor1);
            informacoesCorretor.add(corretor1.toString());
            
            r.nextLine();
            
            System.out.println("Corretor 2: ");
            String nomeCorretor2 = r.nextLine();
            String cpfCorretor2 = r.nextLine();
            Endereco enderecoCorretor2 = endereco5; 
            String celularCorretor2 = r.nextLine();
            String creciCorretor2 = r.nextLine();
            Corretor corretor2 = new Corretor(nomeCorretor2, cpfCorretor2, enderecoCorretor2, celularCorretor2, creciCorretor2);
            informacoesCorretor.add(corretor2.toString());
            
            r.nextLine();
            
            System.out.println("Corretor 3: ");
            String nomeCorretor3 = r.nextLine();
            String cpfCorretor3 = r.nextLine();
            Endereco enderecoCorretor3 = endereco6; 
            String celularCorretor3 = r.nextLine();
            String creciCorretor3 = r.nextLine();
            Corretor corretor3 = new Corretor(nomeCorretor3, cpfCorretor3, enderecoCorretor3, celularCorretor3, creciCorretor3);
            informacoesCorretor.add(corretor3.toString());

            //Aqui construo os ímoveis, adicionando as informações já obitdas e obtendo área e preço, para completar o ímovel.
            System.out.println("Digite a área e o preço do imóvel 1: ");
            double area1 = r.nextDouble();
            double preco1 = r.nextDouble();
            r.nextLine(); 
            Imovel imovel1 = new Imovel(tipo1, endereco1, area1, preco1, proprietario1);
            imoveisDisponiveis.add(imovel1);

            System.out.println("Digite a área e o preço do imóvel 2: ");
            double area2 = r.nextDouble();
            double preco2 = r.nextDouble();
            r.nextLine(); 
            Imovel imovel2 = new Imovel(tipo2, endereco2, area2, preco2, proprietario2);
            imoveisDisponiveis.add(imovel2);

            System.out.println("Digite a área e o preço do imóvel 3: ");
            double area3 = r.nextDouble();
            double preco3 = r.nextDouble();
            r.nextLine(); 
            Imovel imovel3 = new Imovel(tipo3, endereco3, area3, preco3, proprietario3);
            imoveisDisponiveis.add(imovel3);

            System.out.println("Digite a área e o preço do imóvel 4: ");
            double area4 = r.nextDouble();
            double preco4 = r.nextDouble();
            r.nextLine(); 
            Imovel imovel4 = new Imovel(tipo4, endereco4, area4, preco4, proprietario4);
            imoveisManutencao.add(imovel4);

            System.out.println("Digite a área e o preço do imóvel 5: ");
            double area5 = r.nextDouble();
            double preco5 = r.nextDouble();
            r.nextLine();
            Imovel imovel5 = new Imovel(tipo2, endereco5, area5, preco5, proprietario5);
            imoveisManutencao.add(imovel5);

            System.out.println("Digite a área e o preço do imóvel 6: ");
            double area6 = r.nextDouble();
            double preco6 = r.nextDouble();
            r.nextLine(); 
            Imovel imovel6 = new Imovel(tipo3, endereco6, area6, preco6, proprietario6);
            imoveisManutencao.add(imovel6);


            System.out.println("Digite o tempo de contrato 1 e o valor do contrato 1:");
            String tempoContrato1 = r.nextLine();
            double valorContrato1 = r.nextDouble();
            r.nextLine(); 
            ContratoAluguel<String> contratoAluguel1 = new ContratoAluguel<>(imovel1, corretor1, cliente1, tempoContrato1, valorContrato1);
            contratos.add(contratoAluguel1.toString());

            System.out.println("Digite o tempo de contrato 2 e o valor do contrato 2:");
            String tempoContrato2 = r.nextLine();
            double valorContrato2 = r.nextDouble();
            r.nextLine(); 
            ContratoAluguel<String> contratoAluguel2 = new ContratoAluguel<>(imovel2, corretor2, cliente2, tempoContrato2, valorContrato2);
            contratos.add(contratoAluguel2.toString());


            System.out.println("Digite a razão social e o CNPJ da corretora:");
            String razaoSocial = r.nextLine();
            String cnpj = r.nextLine();
            ContratoAluguelComercial contrato1 = new ContratoAluguelComercial<>(imovel1, corretor1, cliente1, contratoAluguel1.getTempo(), contratoAluguel1.getValor(), razaoSocial, cnpj);
            contratos.add(contrato1.toString());

            //Crio uma coleção de informações de clientes, proprietários e corretores.
            List<List<String>> colecaoInformacoes = new ArrayList<>();
            colecaoInformacoes.add(informacoesCliente);
            colecaoInformacoes.add(informacoesProprietario);
            colecaoInformacoes.add(informacoesCorretor);
        
            //Aqui eu ordeno as listas de ímoveis de acordo com o tipo do ímovel.
            Collections.sort(imoveisDisponiveis);
            Collections.sort(imoveisManutencao);
        

            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println();
            System.out.println("1 - Listar Informacoes de Clientes. ");
            System.out.println("2 - Listar Informacoes de Proprietários. ");
            System.out.println("3 - Listar Informacoes de Corretores. ");
            System.out.println("4 - Listar Informacoes de Clientes, Proprietários e Corretores. ");
            System.out.println("5 - Listar Contratos. ");
            System.out.println("6 - Listar Imóveis disponiveis. ");
            System.out.println("7 - Listar Imóveis que precisam de manutenção. ");
            int escolha = r.nextInt();

            switch (escolha) {
                case 1:
                    for (String infoCliente : informacoesCliente){
                        System.out.println(infoCliente);
                    }  
                    break;

                case 2:
                    for (String infoProprietario : informacoesProprietario){
                        System.out.println(infoProprietario);
                    } 
                    break;

                case 3:
                    for (String infoCorretor : informacoesCorretor){
                        System.out.println(infoCorretor);
                    }
                    break;

                case 4:
                    for (List<String> informacoes : colecaoInformacoes){
                        for (String info : informacoes) {
                            System.out.println(info);
                        }
                        System.out.println(); 
                    }  
                    break;

                case 5:
                    for(String contrato : contratos){
                        System.out.println(contrato);
                    }
                    break;

                case 6:
                    for (Imovel imovelDispo : imoveisDisponiveis){
                        System.out.println(imovelDispo);
                    }
                    break;

                case 7:
                    for (Imovel imovelManu : imoveisManutencao){
                        System.out.println(imovelManu);
                    }
                    break;
                
                default:
                    System.out.println("Opção inválida. Escolha um número de 1 a 7.");
            }  

        }catch(InputMismatchException e){
            System.out.println("Entrada inválida para inteiros");
        }  
    }
}
