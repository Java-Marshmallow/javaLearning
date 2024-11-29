package java101;

public class PracticeProblems {
    static int countOccurences(int[] arr, int n)
    {
        int occurences = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == n) occurences++;
        }
        return occurences;
    }

    static int[] reverseArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
        int[] reversedArr = new int[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            reversedArr[j] = arr[i];
            j++;
        }
        return reversedArr;
    }

    static double sumGrid(double[][] arr)
    {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static int fib(int n)
    {
        int x = 0;
        int y = 1;
        int z = y + x;
        /*System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/
        for(int i = 0; i < n - 3; i++)
        {
            x = y;
            y = z;
            z = y + x;
            //System.out.println(z);
        }
        return z;
    }
}
