package java8.functionalprogramming;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Habitualway1 {

    public static void main(String[] args) {

        List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12"));

        /**
         * Suppose we’re asked to total the prices greater than $20, discounted by 10%.
         * Let’s do that in the habitual Java way first.
         */
        BigDecimal totalDiscountPrice = BigDecimal.ZERO;
        for (BigDecimal price : prices) {
            if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
                totalDiscountPrice = totalDiscountPrice.add(price.multiply(BigDecimal.valueOf(0.9)));
            }
        }
        System.out.println("Total of discounted price = " + totalDiscountPrice);
        /**
         *It worked, but writing it feels dirty. It’s no fault of ours; we had to use what
         * was available. But the code is fairly low level—it suffers from “primitive
         * obsession” and defies the single-responsibility principle. Those of us working
         * from home have to keep this code away from the eyes of kids aspiring to be
         * programmers, for they may be dismayed and sigh, “That’s what you do for a
         * living?”
         *
         *
         * A Better Way, Again
         * Now we can do better, a lot better. Our code can resemble the requirement
         * specification. This will help reduce the gap between the business needs and
         * the code that implements it, further reducing the chances of the requirements
         * being misinterpreted.
         */


        final BigDecimal totalDiscountedPrice =
                prices.stream()
                        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                        .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
        /**
         * Let’s read that aloud—filter prices greater than $20, map the prices to dis-
         * counted values, and then add them up. The code flows along with logic in the
         * same way we’d describe the requirements.
         */


        System.out.println("total discounted price :" + totalDiscountedPrice);
    }

}
