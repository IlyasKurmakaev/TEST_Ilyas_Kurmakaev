import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(0);
        System.out.println(getSecondInSorted(arrayList));
    }
    public static int getSecondInSorted(ArrayList<Integer> arrayList ){

        final int[] returnInt = new int[1];
        arrayList.stream().sorted().skip(arrayList.size() - 1).forEach(s -> returnInt[0] = s);
        return returnInt[0];
    }
}
