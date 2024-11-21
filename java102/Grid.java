package java102;

import java.util.ArrayList;

public class Grid<T> {
    public static int maxSideLength;
    private final ArrayList<ArrayList<T>> grid;
    public final int sideLength;

    public Grid(int sideLength, T defaultVal)
    {
        this.sideLength = sideLength;
        if(sideLength > maxSideLength) maxSideLength = sideLength;
        this.grid = new ArrayList<ArrayList<T>>(sideLength);
        for(int i = 0; i < sideLength; i++)
        {
            grid.add(new ArrayList<T>(sideLength));
            for(int j = 0; j < sideLength; j++)
            {
                grid.get(i).add(defaultVal);
            }
        }
    }

    public T get(int row, int col) {return this.grid.get(row).get(col);}
    public void set(int row, int col, T val) {this.grid.get(row).set(col, val);}
    public ArrayList<T> diagonal()
    {
        ArrayList<T> list = new ArrayList<T>();
        for(int i = 0; i < this.sideLength; i++)
        {
            list.add(this.get(i, i));
        }
        return list;
    }


    @Override
    public String toString()
    {
        String str = "";
        for(int i = 0; i < this.sideLength; i++)
        {
            for(int j = 0; j < this.sideLength; j++)
            {
                str += this.grid.get(i).get(j) + " ";
            }
            str += "\n";
        }

        return str;
    }
}
