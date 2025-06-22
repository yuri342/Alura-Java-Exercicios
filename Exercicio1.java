import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SistemaDeLog {

    public static void main(String[] args) {
        // Simulação da criação de uma tarefa
        String tarefa = "Enviar relatório semanal";

        // Captura da data e hora atuais
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        // Exibição das informações
        System.out.println("Tarefa criada: " + tarefa);
        System.out.println("Data atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);
    }
}
