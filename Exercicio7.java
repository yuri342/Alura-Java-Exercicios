import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembreteDePagamento {

    public static void main(String[] args) {
        // Data de vencimento
        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);

        // Período de antecedência em dias
        int antecedenciaDias = 5;

        // Cálculo da data do lembrete
        LocalDate dataLembrete = dataVencimento.minusDays(antecedenciaDias);

        // Formatação da data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataLembrete.format(formato);

        // Exibição do resultado
        System.out.println("Data do lembrete: " + dataFormatada);
    }
}
