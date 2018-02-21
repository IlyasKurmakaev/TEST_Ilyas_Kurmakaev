import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSimpleMultipliers(81));
    }
    public static ArrayList<Integer> getSimpleMultipliers(int num){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        if (num <= 9){
            arrayList.add(num);
            return arrayList;
        }

        int i = 2;
        while (num >= 10) {
            while (true) {
                if (num % i == 0) {
                    arrayList.add(i);
                    num /= i;
                    i = 2;
                    break;
                } else {
                    i++;
                }

            }
        }
        arrayList.add(num);
        return arrayList;
    }
}