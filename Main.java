import collections.MyList;

public class Main {
    public static void main(String[] args) {


        MyList list = new MyList();

        int[] input = {1,1,3,3,4,4,7,7,7,9,9,9,9};

        for (int n : input) {
            list.addListElement(n);
        }

        MyList unique = list.removeDuplicates();
        unique.display();
    }
}
