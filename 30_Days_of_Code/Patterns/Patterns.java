class Patterns
{
    public static void main(String[] args) {
       pattern45('E'); 
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

    public static void pattern40(int n)
    {
        for (int i = 1; i <= 2 * n; i++) {

            for (int j = 1; j <= 2 * n; j++) {
                if( j >= 5 - i && j <= i + 3 && j >= i - 3 && j <= 11 - i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern41(int n)
    {
        for (int i = 1; i < 2 * n; i++) {

            for (int j = 0; j <= 2 * n; j++) {
                if( j >= 5 - i && j <= i + 3 && j >= i - 3 && j <= 11 - i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern42(int n)
    {
        for (int i = 0; i <= 2 * n; i++) {

            for (int j = 0; j <= 2 * n; j++) {
                if(j >= 6 - i && j <= 4 + i && j >= i - 4 && j <= 14 - i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern43(int n)
    {
        for (int i = 1; i < 2 * n; i++) {

            for (int j = 1; j < 2 * n; j++) {
                if(j == 6 - i || j == 4 + i || j == i - 4 || j == 14 - i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern44(int n)
    {
        int k = 1;
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void pattern45(char n)
    {
        int rows = n - 'A' ;
        for (int i = 1; i <= rows; i++) {
            
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }
            
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            
            ch -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch--);
            }
            System.out.println();
        }
    }

}


