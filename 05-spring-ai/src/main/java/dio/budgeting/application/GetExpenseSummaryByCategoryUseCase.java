package dio.budgeting.application;

import dio.budgeting.application.output.ExpenseSummaryOutput;
import dio.budgeting.domain.Category;
import dio.budgeting.domain.TransactionRepository;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class GetExpenseSummaryByCategoryUseCase {

    private final TransactionRepository transactionRepository;

    public GetExpenseSummaryByCategoryUseCase(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Tool(
        name = "get-expense-summary-by-category",
        description = "Calcula a quantidade de transações e o valor total gasto por categoria"
    )
    public ExpenseSummaryOutput execute(
            @ToolParam(description = "Categoria das transações") Category category) {

        var transactions = transactionRepository.findAllByCategory(category);

        long totalAmount = transactions.stream()
                .mapToLong(transaction -> transaction.getAmount())
                .sum();

        return new ExpenseSummaryOutput(
                category.name(),
                transactions.size(),
                totalAmount / 100.0
        );
    }
}