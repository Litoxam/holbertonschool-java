public class Employee {
    private double fixedSalary;

    // constructor
    public Employee(double fixedSalary){
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary(){
        return fixedSalary;
    }

    // employee has +10% bonus if reachedTarget = True
    public double calculateBonus(Department department) {
        double bonus = 0;

        if (department.reachedTarget()) {
            bonus = 0.1 * fixedSalary;
        }

        return bonus;
    }

    // use the calculateBonus method to get the bonus
    public double calculateTotalSalary(Department department){
        return fixedSalary + calculateBonus(department);
    }



}