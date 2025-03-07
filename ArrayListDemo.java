import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list.contains(5));
        System.out.println(list.remove(3));
        System.out.println(list);
        for (int ele : list) {
            System.out.println(ele);
        }

        


    }

}
