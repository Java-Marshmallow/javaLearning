package java101;
//I don't exactly understand why but it wants to add this and won't work without it
public class Main 
{
    static String makeAGrid(int sizeX, int sizeY)
    {
        if(sizeX <= 0 || sizeY <= 0) return ">:c";
        String s = "";
        for(int i = 0; i < sizeY; i++)
        {
            for(int j = 0; j < sizeX; j++)
            {
                s += ":3 ";
            }
            s += "\n";
        }
        return s;
    }
    public static void main(String[] args)
    {
        System.out.println(makeAGrid(2, 3));

        int[] list = {0, 1, 1, 3, 5, 7, 9};
        System.out.println(PracticeProblems.countOccurences(list, 1));
        int[] reversedList = PracticeProblems.reverseArray(list);
        for(int i = 0; i < reversedList.length; i++) System.out.println(reversedList[i]);
        double[][] list2D = 
        {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        System.out.println(PracticeProblems.sumGrid(list2D));
        System.out.println(PracticeProblems.fib(9));
    }
}