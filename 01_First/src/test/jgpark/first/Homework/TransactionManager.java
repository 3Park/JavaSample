package test.jgpark.first.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TransactionManager {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Predicate: 조건에 맞는 트랜잭션만 반환
    public List<Transaction> filterTransactions(Predicate<Transaction> predicate) {
        // TODO 구현
        return transactions.stream().filter(predicate).collect(Collectors.toList());
    }

    // Function: 트랜잭션 금액 변환(매핑)
    public List<Double> mapAmounts(Function<Transaction, Double> function) {
        // TODO 구현
        return transactions.stream().map(function).collect(Collectors.toList());
    }

    // Consumer: 트랜잭션 처리(출력, 로깅 등)
    public void processTransactions(Consumer<Transaction> consumer) {
        // TODO 구현
        transactions.stream().forEach(consumer);
    }
}

