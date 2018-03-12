package design.creational.builder;

public class BuilderPractice {

    public static void main(String[] args) {
        LunchOrderTest.Builder builder = new LunchOrderTest.Builder();
        builder.bread("wheat").condiments("lettuce").dressing("mustard").meat("pork");
        LunchOrderTest lunchOrderTest = builder.build();
        System.out.println(lunchOrderTest);
    }
}

class LunchOrderTest {
    private final String bread;
    private final String condiments;
    private final String meat;
    private final String dressing;

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getMeat() {
        return meat;
    }

    public String getDressing() {
        return dressing;
    }

    @Override
    public String toString() {
        return "LunchOrderTest{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", meat='" + meat + '\'' +
                ", dressing='" + dressing + '\'' +
                '}';
    }

    public LunchOrderTest(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.meat = builder.meat;
        this.dressing = builder.dressing;

        //overriding toString() just for sysout lunchOrderTest



    }

    static class Builder {

        private String bread;
        private String condiments;
        private String meat;
        private String dressing;

        // we need one no argument constructor
        public Builder() { }


        public LunchOrderTest build() {
            return new LunchOrderTest(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
    }
}


