import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N == 1){
            System.out.println("Weird");
        }else if(N >= 2 && N <= 5){
            if(N % 2 == 0){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
            }
        }else if(N >= 6 && N <= 20){
            if(N % 2 == 0){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }else if(N > 20){
            if(N % 2 == 0){
                System.out.println("Not Weird");
            }else{
                System.out.println("Weird");
            }
        }else{
            System.out.println("Enter a right number");
        }

        bufferedReader.close();
    }
}
