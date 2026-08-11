public class Manager extends Employee {

    // constructor
    // super() calls the Employee constructor
    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    // manager overrides the Employee calculateBonus method
    // manager has +20% bonus if reachedTarget = True
    // plus 1% of the difference between achieved target and target
    @Override
    public double calculateBonus(Department department) {
        double bonus = 0;

        if (department.reachedTarget()) {
            double diff = department.getAchievedTargetValue()
                    - department.getTargetValue();

            double plusBonus = 0.01 * diff;

            bonus = (0.2 * getFixedSalary()) + plusBonus;
        }

        return bonus;
    }
}
