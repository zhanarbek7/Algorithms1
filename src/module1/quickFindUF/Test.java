package module1.quickFindUF;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(5);
        System.out.println(Arrays.toString(qf.id));
        qf.union(2,3);
        qf.union(2,4);
        System.out.println(Arrays.toString(qf.id));
    }
}
