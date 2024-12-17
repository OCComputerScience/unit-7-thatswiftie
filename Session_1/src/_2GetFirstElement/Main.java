package _2GetFirstElement;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> firstArrList = new ArrayList<>();
        //add values
        firstArrList.add(13);
        firstArrList.add(7);
        firstArrList.add(20);
        firstArrList.add(14);
        firstArrList.add(8);
        firstArrList.add(11);
        firstArrList.add(26);
        firstArrList.add(1);
        firstArrList.add(17);
        firstArrList.add(135);

        //print the first & last
        System.out.println(firstArrList.get(0));
        System.out.println(firstArrList.get(firstArrList.size() - 1));

        for(int i = 0; i < firstArrList.size(); i++)
        {
            if(firstArrList.get(i) % 2 == 1)
            {
                System.out.println(firstArrList.get(i));
            }
        }
    }
}
