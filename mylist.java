package lab6;

import java.util.LinkedList;

public class mylist {
    public static LinkedList add_sort(LinkedList temp,LinkedList newer, int value)
    {
        System.out.println(temp);
        temp.add(value);
        System.out.println(temp);
        for (int i=0; i<6;i++)
        {
            int list_value = (int) temp.get(0);
            if (list_value<value)
            {
                newer.add(list_value);
                temp.removeFirst();
            }
            else if (list_value > value)
            {
                newer.add(value);
                newer.add(list_value);
                temp.removeFirst();
                value = (int) temp.get(0);
            }
            else
            {
                newer.add(list_value);
                temp.removeFirst();
                value = (int) temp.get(0);
            }
        }
        System.out.println(newer);
        return newer;
    }
    public static void swapValues(LinkedList sortedlist, int index1,int index2)
    {
        System.out.println(sortedlist);
        int temp1 = (int) sortedlist.get(index1);
        int temp2 = (int)sortedlist.get(index2);
        sortedlist.set(index1,temp2);
        sortedlist.set(index2,temp1);
        System.out.println(sortedlist);
    }
    public static int findValue(LinkedList rand, int searchval) {
        int counter =0;
        while (counter< rand.size())
        {
            if (rand.contains(searchval) == true) {
                System.out.println(rand.indexOf(searchval));
                System.out.println(1);
            }
            counter++;
        }
        return -1;
    }
    public static  void main(String [] args)
    {
        LinkedList sortedlist = new LinkedList();
        LinkedList newer =  new LinkedList();
        LinkedList temp = new LinkedList();
        sortedlist.add(1);
        sortedlist.add(3);
        sortedlist.add(5);
        sortedlist.add(7);
        sortedlist.add(9);
        sortedlist.add(11);
        add_sort(sortedlist,newer,2);//1
        swapValues(newer,2,6);//2
        LinkedList rand = new LinkedList();
        for(int i =0 ; i <= 500;i++)
        {
            int random = (int) (Math.random() * 9999 + 1000);
            rand.add(random);
        }
        System.out.println(rand);
        int my_random = (int) (Math.random() * 9999 + 1000);
        System.out.println(my_random);
        System.out.println(findValue(rand,my_random));

    }
}
