public class BubbleSort {
    public static void main(String[] args) {

    int a = 0;
    int b = 0;

        int[] talDerSkalSorteres = new int[9];
        talDerSkalSorteres[0] = 6;
        talDerSkalSorteres[1] = 7;
        talDerSkalSorteres[2] = 9;
        talDerSkalSorteres[3] = 2;
        talDerSkalSorteres[4] = 9;
        talDerSkalSorteres[5] = 1;
        talDerSkalSorteres[6] = 4;
        talDerSkalSorteres[7] = 3;
        talDerSkalSorteres[8] = 5;



        for (int i = 8; i < 0; i--) {

            a = talDerSkalSorteres[i];
            b = talDerSkalSorteres[i - 1];


            if (a < b) {

                talDerSkalSorteres[i]= b;
                talDerSkalSorteres[i-1]= a;

                System.out.println("byttet" + a + b);

            }

        }

        //System.out.println(talDerSkalSorteres(i);


    }
}
