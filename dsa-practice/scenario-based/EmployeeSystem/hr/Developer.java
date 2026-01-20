package hr;

class Developer extends Employee {

    private final double bonus;

    Developer(String name, double salary) {
        super(name, salary);
        this.bonus = salary > 50000 ? salary * 0.05 : 0.0;
    }

    @Override
    double getBonus() {
        return bonus;
    }
}

