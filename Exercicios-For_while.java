import java.util.*;

public class ExerciciosCondicionaisMonolito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\n--- MENU DE EXERCÍCIOS ---");
            System.out.println("1 - Soma total das receitas");
            System.out.println("2 - Soma dos números pares de 1 a 100");
            System.out.println("3 - Cálculo do fatorial");
            System.out.println("4 - Maior número da lista");
            System.out.println("5 - Tentativas de senha (3 tentativas)");
            System.out.println("6 - Validação de nome (mínimo 3 caracteres)");
            System.out.println("7 - Contar positivos e negativos");
            System.out.println("8 - Contar até n ignorando números terminados em 5");
            System.out.println("9 - Lista de convidados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
                continue;
            }

            switch (opcao) {
                case 0:
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;

                case 1:
                    somaTotalReceitas();
                    break;

                case 2:
                    somaPares();
                    break;

                case 3:
                    fatorial(scanner);
                    break;

                case 4:
                    maiorNumero(scanner);
                    break;

                case 5:
                    tentativasSenha(scanner);
                    break;

                case 6:
                    validaNome(scanner);
                    break;

                case 7:
                    contaPosNeg(scanner);
                    break;

                case 8:
                    contarIgnorar5(scanner);
                    break;

                case 9:
                    listaConvidados(scanner);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    static void somaTotalReceitas() {
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        for (int v : valores) soma += v;
        System.out.println("A soma total das receitas é: " + soma);
    }

    static void somaPares() {
        int soma = 0;
        for (int i=2; i<=100; i+=2) soma += i;
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }

    static void fatorial(Scanner scanner) {
        System.out.print("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());
        long fat = 1;
        for (int i=2; i<=n; i++) fat *= i;
        System.out.println("O fatorial de " + n + " é: " + fat);
    }

    static void maiorNumero(Scanner scanner) {
        System.out.print("Digite os números separados por espaço: ");
        String[] nums = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;
        for(String s : nums) {
            int val = Integer.parseInt(s);
            if(val > maior) maior = val;
        }
        System.out.println("O maior número é: " + maior);
    }

    static void tentativasSenha(Scanner scanner) {
        String senhaCorreta = "1234";
        int tentativas = 3;
        while(tentativas > 0) {
            System.out.print("Digite sua senha: ");
            String tentativa = scanner.nextLine();
            if(tentativa.equals(senhaCorreta)) {
                System.out.println("Senha Correta! Acesso concedido!");
                return;
            } else {
                tentativas--;
                if(tentativas > 0)
                    System.out.println("Senha incorreta. Você tem " + tentativas + (tentativas == 1 ? " tentativa restante." : " tentativas restantes."));
            }
        }
        System.out.println("Conta bloqueada temporariamente.");
    }

    static void validaNome(Scanner scanner) {
        String nome;
        do {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() < 3) System.out.println("Nome inválido. Digite novamente.");
        } while (nome.length() < 3);
        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
    }

    static void contaPosNeg(Scanner scanner) {
        int pos = 0, neg = 0;
        while(true) {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();
            if(entrada.equalsIgnoreCase("fim")) break;
            try {
                int val = Integer.parseInt(entrada);
                if(val > 0) pos++;
                else if(val < 0) neg++;
            } catch(Exception e) {
                System.out.println("Entrada inválida.");
            }
        }
        System.out.println("Números positivos: " + pos);
        System.out.println("Números negativos: " + neg);
    }

    static void contarIgnorar5(Scanner scanner) {
        System.out.print("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=1; i<=n; i++) {
            if(i % 10 == 5) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void listaConvidados(Scanner scanner) {
        List<String> convidados = new ArrayList<>();
        while(true) {
            System.out.print("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String entrada = scanner.nextLine();
            if(entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            } else if(entrada.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
            } else {
                boolean existe = convidados.stream().anyMatch(n -> n.equalsIgnoreCase(entrada));
                if(existe) System.out.println("O nome " + entrada + " já está na lista de convidados.");
                else {
                    convidados.add(entrada);
                    System.out.println(entrada + " foi adicionado à lista de convidados.");
                }
            }
        }
    }
}


import java.util.Scanner;

public class SubidaEscadaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!");

        scanner.close();
    }
}

