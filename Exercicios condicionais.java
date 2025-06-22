# 1 - Par ou Ímpar
codigo1 = '''import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 8; // Exemplo fixo, pode trocar
        
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
'''

# 2 - Situação do estudante
codigo2 = '''public class SituacaoEstudante {
    public static void main(String[] args) {
        double media = 8.2; // exemplo, pode alterar

        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("O estudante teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }
    }
}
'''

# 3 - Verificação de senha
codigo3 = '''import java.util.Scanner;

public class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "123456";

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}
'''

# 4 - Comparação de dois números
codigo4 = '''import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2 + ".");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}
'''

# 5 - Desconto em compra
codigo5 = '''import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor >= 100.0) {
            double valorComDesconto = valor * 0.9;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: R$ " + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valor);
        }

        scanner.close();
    }
}
'''

# 6 - Dia útil ou não
codigo6 = '''import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();

        switch (dia) {
            case "segunda":
            case "terça":
            case "quarta":
            case "quinta":
            case "sexta":
                System.out.println(capitalize(dia) + " é um dia útil.");
                break;
            case "sábado":
            case "domingo":
                System.out.println(capitalize(dia) + " não é um dia útil.");
                break;
            default:
                System.out.println("Dia inválido.");
        }

        scanner.close();
    }

    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
'''

# 7 - Faixa permitida para empréstimo
codigo7 = '''import java.util.Scanner;

public class VerificaEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        double valor = scanner.nextDouble();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + (int)valor + ", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + (int)valor + ", não está dentro do intervalo permitido para empréstimo.");
        }

        scanner.close();
    }
}
'''

# 8 - Verificar se forma triângulo
codigo8 = '''import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }

        scanner.close();
    }
}
'''

# 9 - Compatibilidade para doação de sangue
codigo9 = '''import java.util.Scanner;

public class DoadorSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível.");
        } else {
            System.out.println("O doador não é compatível.");
            if (!idadeValida) {
                System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("Motivo: Deve pesar mais de 50 kg.");
            }
        }

        scanner.close();
    }
}
'''

# 10 - Sistema de segurança com código e nível
codigo10 = '''import java.util.Scanner;

public class SistemaSeguranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o nível de permissão: ");
        int nivel = scanner.nextInt();

        boolean codigoCorreto = codigo == 2023;
        boolean nivelValido = nivel == 1 || nivel == 2 || nivel == 3;

        if (codigoCorreto && nivelValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado!");
            if (!codigoCorreto && !nivelValido) {
                System.out.println("Motivos: código incorreto e nível de permissão inválido.");
            } else if (!codigoCorreto) {
                System.out.println("Motivo: código incorreto.");
            } else {
                System.out.println("Motivo: nível de permissão inválido.");
            }
        }

        scanner.close();
    }
}
'''
