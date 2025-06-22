import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GeradorDeRelatorios {

    public static void main(String[] args) {
        // Captura da data e hora atuais
        LocalDateTime agora = LocalDateTime.now();

        // Formatação para padrão brasileiro
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        // Aplicando formatação
        String dataFormatada = agora.format(formatoData);
        String horaFormatada = agora.format(formatoHora);

        // Exibindo o resultado
        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);
    }
}
