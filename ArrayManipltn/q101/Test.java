package ArrayManipltn.q101;

public class Test {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers [0]=10;
        numbers [1]=20;

        numbers=new int[4];            //yeni array tanimlamis yukardaki gecersiz
        numbers [2]=30;                //int oldugu icin null olmaz 00 olur
        numbers [3]=40;
        for (int x:numbers){
            System.out.print(" "+x);
        }

    }
}

// 0 0 30 40
