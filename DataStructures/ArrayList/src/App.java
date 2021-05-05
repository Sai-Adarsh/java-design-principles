import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // create ArrayList
        ArrayList<Integer> mainArr = new ArrayList<Integer>();
        mainArr = createArray();
        System.out.println(mainArr);
        
        // delete ArrayList
        int place_to_be_deleted = 5;
        mainArr = deleteAtIndex(mainArr, place_to_be_deleted);
        System.out.println(mainArr);

        // update ArrayList
        int place_to_be_updated = 4;
        mainArr = editAtIndex(mainArr, place_to_be_updated);
        System.out.println(mainArr);

        // clear full Array
        mainArr = clearArr(mainArr);
        System.out.println(mainArr);
    }

    public static ArrayList<Integer> createArray() {
        ArrayList<Integer> newArr = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            newArr.add(i + 1);
        }
        return newArr;
    }

    public static ArrayList<Integer> deleteAtIndex(ArrayList<Integer> givenArr, int place_to_be_deleted) {
        givenArr.remove(place_to_be_deleted);
        return givenArr;
    }

    public static ArrayList<Integer> editAtIndex(ArrayList<Integer> givenArr, int place_to_be_updated) {
        givenArr.set(place_to_be_updated, 100);
        return givenArr;
    }

    public static ArrayList<Integer> clearArr(ArrayList<Integer> givenArr) {
        givenArr.clear();
        return givenArr;
    }
}