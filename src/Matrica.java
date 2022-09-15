import java.util.Random;
public class Matrica {
    private final int Colun, Line;
    private final int[][] arr;
    public Matrica(int Colun, int Line) {
        Random random = new Random();
        arr = new int[Colun][Line];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                set(i, j, random.nextInt(10));
            }
        }
        this.Colun = Colun;
        this.Line = Line;
    }
    public int get(int Colun, int Line) {
        return arr[Colun][Line];
    }
    public void set(int Colun, int Line, int mxSet) {
        arr[Colun][Line] = mxSet;
    }
    void output() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    Matrica plusMatrix(Matrica mx) {
        Matrica mxPlus = new Matrica(Colun, Line);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                mxPlus.set(i, j, get(i, j) + mx.get(i, j));
            }
        }
        return mxPlus;
    }
    Matrica multiNumber(int num) {
        Matrica mx = new Matrica(Colun, Line);

        for (int i = 0; i < mx.Colun; i++) {
            for (int j = 0; j < mx.Line; j++) {
                mx.set(i, j, get(i, j) * num);
            }
        }
        return mx;
    }
    Matrica multiMatrix(Matrica s) {
        Matrica mx = new Matrica(Colun, Line);
        int calc = 0;
        for (int i = 0; i < mx.Colun; i++) {
            for (int j = 0; j < mx.Line; j++) {
                if (mx.Colun < mx.Line) {
                    for (int k = 0; k < mx.Colun; k++) {
                        calc = calc + (get(i, k) * get(k,j));
                    }
                }
                else {
                    for (int k = 0; k < mx.Line; k++) {
                        calc = calc + (get(i, k) * s.get(k,j));
                    }
                }
                mx.set(i,j,calc);
                calc = 0;
            }
        }
        return mx;
    }

}
