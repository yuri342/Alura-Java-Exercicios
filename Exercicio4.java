import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculadoraDePrazo {

    public static void main(String[] args) {
        // Data de início do projeto
        LocalDate dataInicio = LocalDate.of(2025, 3, 15);

        // Prazo estimado em dias
        int prazoDias = 15;

        // Cálculo da data de entrega
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        // Formatação da data de entrega
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataEntregaFormatada = dataEntrega.format(formato);

        // Exibição do resultado
        System.out.println("Data de entrega: " + dataEntregaFormatada);
    }
}
