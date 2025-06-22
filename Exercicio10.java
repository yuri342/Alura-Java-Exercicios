import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleDeHorario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            // Entrada do horário de entrada
            System.out.print("Digite o horário de entrada (HH:mm): ");
            LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

            // Entrada da carga horária diária (em horas)
            System.out.print("Digite a carga horária diária (em horas): ");
            int cargaHoraria = scanner.nextInt();

            // Cálculo do horário de saída previsto
            LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

            // Entrada do horário real de saída
            System.out.print("Digite o horário real de saída (HH:mm): ");
            LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

            // Cálculo da diferença entre horário real e previsto
            Duration diferenca = Duration.between(saidaPrevista, saidaReal);

            long horas = Math.abs(diferenca.toHours());
            long minutos = Math.abs(diferenca.toMinutes() % 60);

            // Exibição dos resultados
            System.out.println("Horário de entrada: " + entrada.format(formatter));
            System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
            System.out.println("Horário real de saída: " + saidaReal.format(formatter));

            String sinal = "";
            if (!diferenca.isZero()) {
                sinal = diferenca.isNegative() ? "-" : "+";
            }

            System.out.printf("Saldo de horas: %s%dh %dmin\n", sinal, horas, minutos);

        } catch (Exception e) {
            System.out.println("Erro na entrada dos dados. Certifique-se de usar o formato correto (HH:mm) e valores válidos.");
        } finally {
            scanner.close();
        }
    }
}
