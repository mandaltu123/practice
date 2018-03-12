package design.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("wheat").meat("ham").condiments("iceberg lettuce");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);
    }
}

class LunchOrder {
    private final String bread;
    private final String dressings;
    private final String condiments;
    private final String meat;


    @Override
    public String toString() {
        return "LunchOrder{" +
                "bread='" + bread + '\'' +
                ", dressings='" + dressings + '\'' +
                ", condiments='" + condiments + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public LunchOrder(Builder builder) {

        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressings = builder.dressings;
        this.meat = builder.meat;


    }



    public static class Builder {

        private String bread;
        private String dressings;
        private String condiments;
        private String meat;

        // need one no argument constructor
        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressings(String dressings) {
            this.dressings = dressings;
            return this;
        }


        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}