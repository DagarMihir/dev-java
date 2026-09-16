package basics;

public class ArrayLesson {
    public static void main(StringLesson[] args) {
        int num[] = {3, 7, 2, 4};
        //System.out.println(num[1]);

        // update value
        num[1] = 4;
        // System.out.println(num[1]);

        int num1[] = new int[4];
        // System.out.println(num1[1]); // initializes with 0
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;

        // for(int i : num1){
        //     //System.out.println(i);
        // }

        // int num2[][] = new int[3][4];
        // for(int i = 0;  i < 3; i++){
        //     for(int j = 0; j < 4; j++){
        //         System.out.print(num2[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // assigning random values
        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 4; j++){
        //         num2[i][j] = (int)(Math.random() * 10);
        //         System.out.print(num2[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        // for(int n[] : num2){
        //     for(int i : n){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        // int jagged[][] = new int[3][];

        // jagged[0] = new int[3];
        // jagged[1] = new int[4];
        // jagged[2] = new int[2];

        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < jagged[i].length; j++){
        //         jagged[i][j] = (int)(Math.random() * 10);
        //         System.out.print(jagged[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        //int threeD[][][] = new int[3][4][5];

        int num3[] = new int[6];
        num3[0] = 1;
        num3[1] = 2;
        num3[2] = 3;
        num3[3] = 4;
        
        for(int i = 0; i < num3.length; i++){
            System.out.println(num3[i]);
        }
    }
}
