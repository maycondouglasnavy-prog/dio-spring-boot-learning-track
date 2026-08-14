package dio.budgeting.application.output;

public record ExpenseSummaryOutput(
        String category,
        int transactionCount,
        double totalValue
) {
}