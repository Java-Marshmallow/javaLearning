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
}
