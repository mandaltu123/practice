package java8;

import java.math.BigDecimal;

public class StrategyPattern {


    public static void main(String[] args) {
        Discounter easterDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }
}

interface Discounter {
    BigDecimal appyDiscount(BigDecimal amount);

    static Discounter christmassDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }

    static Discounter newYearDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.8));
    }

    static Discounter independenceDayDiscount() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.7));
    }
}
