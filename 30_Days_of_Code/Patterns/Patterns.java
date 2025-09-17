class Patterns
{
    public static void main(String[] args) {
       pattern12(5); 
    }  
    
    public static void pattern1(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n)
    {
        for (int i = 1; i <= 2 * n; i++) {

            int totalCol = i > n ? 2 * n - i : i;

            for (int j = 1; j <= totalCol; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n)
    {
        for (int i = 1; i <= n; i++) {

            int totalSpace = n - i;
            for (int j = 1; j <= totalSpace; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n)
    {
        for (int i = 1; i <= n; i++) {

            int totalSpace = n - i + 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalSpace; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n)
    {
        for (int i = 1; i <= n; i++) {

            int totalSpace = n - i ;
            for (int j = 1; j <= totalSpace; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n)
    {
        for (int i = n; i >= 1; i--) {

            int totalSpace = n - i ;
            for (int j = 1; j <= totalSpace; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n)
    {
        for (int i = 1; i <= n; i++) {

            int totalSpace = n - i ;
            for (int j = 1; j <= totalSpace; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n)
    {
        for (int i = 1; i <= n; i++) {

            int totalCol = n - i + 1 ;
            for (int j = 1; j <= n - totalCol; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n)
    {
        for (int i = 1; i <= 2 * n; i++) {

            int totalCol = i <= n ? n - i + 1 : i - n;
            int totalSpace = i <= n ? n - totalCol : 2 * n - i;

            for (int j = 1; j <= totalSpace; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}


