import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgendamentoDeEventos {

    public static void main(String[] args) {
        // Data do evento previamente cadastrada
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        // Formatação das datas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataEventoFormatada = dataEvento.format(formato);
        String dataAtualFormatada = dataAtual.format(formato);

        // Exibição das datas
        System.out.println("Data do evento: " + dataEventoFormatada);
        System.out.println("Data atual: " + dataAtualFormatada);

        // Verificação da situação do evento
        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento já ocorreu.");
        } else if (dataEvento.isEqual(dataAtual)) {
            System.out.println("O evento é hoje.");
        } else {
            System.out.println("O evento ainda está por vir.");
        }
    }
}
