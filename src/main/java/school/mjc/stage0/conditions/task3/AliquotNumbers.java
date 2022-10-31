package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (first != second) {
            System.out.println("Aliquot");
        } else if (first % second == 0 || second % first == 0) {
            System.out.println("Not aliquot");
        } else System.out.println("Not aliquot");
    }
}
