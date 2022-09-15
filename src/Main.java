import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Matrica m1  = new Matrica (4,4);
        Matrica m2 = new Matrica (4,4);
        Matrica m3,m4,m5,m6;
        System.out.println("Матрица 1:");
        m1.output();
        System.out.println("Матрица 2:");
        m2.output();
        System.out.println("Матрица 3: Сложение матриц 2-х матриц:");
        m3 = m1.plusMatrix(m2);
        m3.output();
        System.out.println("Умножение первой матрицы на 5:");
        m4 = m1.multiNumber(5);
        m4.output();
        System.out.println("Умножение третьей матрицы на число 2:");
        m5 = m2.multiNumber(2);
        m5.output();

        System.out.println("Умножение матриц:");
        m6 = m1.multiMatrix(m2);
        m6.output();
    }

}
