public class Assignment {


    public static void Pattern(int n){
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (i == 0 & j > 0 && j < n - 1 || (j == 0 || j == n - 1) && i > 0 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("  ");

            for(int j=0; j<n; j++){
                if (j == 0 || (i == 0 || i == n - 1) && j < n - 1 || j == n - 1 && i > 0 && i < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }


            System.out.print("  ");

            for(int j=0; j<n; j++){
                if ((i==0|| i==n-1) || j==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("  ");

            for(int j=0; j<n; j++){
                if (j==0 || (i==n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("                  ");



            for(int j=0; j<n; j++){
                if ((i==0|| i==n-1) || j==(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }
            System.out.print("  ");

            for(int j=0; j<n; j++){
                if ((j==0 || i==j || j==n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("  ");

            for(int j=0; j<n; j++){
                if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("  ");

            for(int j=0; j<n; j++){
                if ((j==0 && i<n-1 )||( j==n-1 && i <n-1) || (i==n-1 && j>0 && j<n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("  ");

            for(int j=0; j<n; j++){
                if ((j==0) || (i==0 && j<n-1) || (j==n-1 && i>0 && i<(n-1) /2) || (i==(n-1)/2 && j<n-1) || (i==j && i>(n-1)/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }

            System.out.print("  ");

            for(int j=0; j<n; j++){
                if ((i==0 && j>0 && j<n-1) || ((j==0 || j==n-1) && i>0 && i<n-1) || ( i==n-1 && j>0 && j<n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }
            System.out.print("  ");

            for(int j=0; j<n; j++){
                if ((j==0 || i==j || j==n-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }







            System.out.println();
        }
    }

    public static void PatternOne(int n1) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <=4; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void PatternTwo(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || j == n - 1 || i == n - 1) || (i + j <= (n - 1) / 2) || (j - i > (n - 1) / 2)) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
    }

    public static void PatternForth(int n ){

        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){

                if ((i-j>=(n-1)/2 || i==n-1)  || (i+j<=(n-1)/2) || i==0){

                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();



        }
    }

    public static void PatternThree (int n) {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){

                if ((i-j>=(n-1)/2) ||(i+j>=(n+(n-1)/2 -1) )){

                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();



        }


    }

    public static void main(String[] args) {
        int n = 14;
//        Pattern(n);

//        PatternOne(n);
//        PatternTwo(n);
//        PatternThree(n);
//        PatternForth(n);






    }
}
