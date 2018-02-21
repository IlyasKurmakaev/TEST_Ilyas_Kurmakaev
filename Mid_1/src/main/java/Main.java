import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(0);
        arrayList.add(4);
        System.out.println(getNInSortArr(arrayList, 1));
    }

    public static int getNInSortArr(ArrayList<Integer> arrayList, int n) {

        final int[] returnInt = new int[1];
        arrayList.stream().sorted().skip(arrayList.size() - n - 1).limit(1).forEach(s -> returnInt[0] = s);
        return returnInt[0];
    }
}





