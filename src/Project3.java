import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (500 - 1) + 1);
            System.out.println(arr[i]);
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(" ");
        System.out.print(max);
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(" ");
        System.out.print(min);
        System.out.println(sumvaules(arr));
        System.out.println(ave(arr));
        System.out.println(gave(arr));
        System.out.println(ince(arr));
        System.out.println(dece(arr));
        printArray3PerLn(arr);
    }

    public static int sumvaules(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(" ");
        System.out.print("Sum: ");
        return sum;
    }

    public static double ave(int[] arr) {
        double ave = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        ave = sum / arr.length;
        System.out.println(" ");
        System.out.print("Average: ");
        return (double) ave;

    }

    public static int gave(int[] arr) {
        double abg = ave(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > abg)
                count++;
        }
        return count;
    }

    public static int ince(int[] arr) {
        int ic = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                ic++;
            }
        }

        System.out.println("Value increases");
        return ic;
    }

    public static int dece(int[] arr) {
        int dec = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                dec++;
            }

        }
        System.out.println("Value decreases");
        return dec;
    }
    public static void printArray3PerLn(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if ((i+1) % 3 == 0)
            {
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i] + " ");
            }
        }
    }



}


