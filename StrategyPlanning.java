interface Strategic{
    void createStrategy();
    void reviewStrategy();
}

abstract class Planner{
    private String strategyName;
    private double budget;

    Planner(String strategyName, double budget) {
        this.strategyName = strategyName;
        this.budget = budget;
    }

    String getStrategyName() {
        return this.strategyName;
    }

    double getBudget() {
        return this.budget;
    }

    abstract void executeStrategy();
}

class BusinessPlanner extends Planner implements Strategic {
    BusinessPlanner(String stategyName, double budget)  {
        super(stategyName, budget);
    }

    void executeStrategy() {
        System.out.println("Executing  business strategy: " + getStrategyName());
    }

    public void createStrategy() {
        System.out.println("Creating statregy");
    }

    public void reviewStrategy() {
        System.out.println("Reviewing strategy");
    }
}

class MarketingPlanner extends Planner implements Strategic{
    MarketingPlanner(String strategyName, double budget) {
        super(strategyName, budget);
    }

    void executeStrategy() {
        System.out.println("Executing strategy: " + getStrategyName());
    }

    public void createStrategy() {
        System.out.println("Creating strategy: " + getStrategyName());
    }

    public void reviewStrategy() {
        System.out.println("Reviewing strategy: " + getStrategyName());
    }
}

public class StrategyPlanning{
    public static void main(String args[]) {
        Planner plan1 = new BusinessPlanner("Expansion plan", 40000);
        Planner plan2 = new MarketingPlanner("Social Media Campaign", 50000);

        plan1.executeStrategy();
        // plan2.reviewStrategy();
        // plan2.reviewStrategy();
        plan2.executeStrategy();


    }
}