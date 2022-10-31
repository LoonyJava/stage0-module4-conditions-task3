package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result = 0;
        double taxes = 0;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            taxes = 0.15;
        } else if (10000 < salary && salary <= 20000) {
            taxes = 0.18;
        } else if (salary > 20000) {
            taxes = 0.2;
        }
        result = salary - (salary * taxes);
        System.out.println(result);
    }
}
