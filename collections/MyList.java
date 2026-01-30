package collections;

public class MyList {
    int capacity = 8;
    int size = 0;
    int[] arr = new int[capacity];

    void resize() {
        capacity = capacity * 2;
        int[] newArr = new int[capacity];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void addListElement(int element) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = element;
    }

    boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public MyList removeDuplicates() {
        MyList uniqueList = new MyList();

        for (int i = 0; i < size; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.addListElement(arr[i]);
            }
        }
        return uniqueList;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("code completed");
        
    }

}
