package Function;

import java.util.ArrayList;

public class Fibonachi implements Funktion {
    @Override
    public int apply(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if ( i == 0 || i == 1){
            return i;
        }
        arrayList.add(0);
        arrayList.add(1);
        for (int j = 1; j < i; j++){
            arrayList.add(arrayList.get(j) + arrayList.get(j-1));
        }
        return arrayList.get(arrayList.size()-1);
    }

}
