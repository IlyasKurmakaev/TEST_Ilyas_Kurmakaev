package Function;

public class Factorial implements Funktion{

    @Override
    public int apply(int i) {
        if (i < 0 ){
            throw new IllegalArgumentException("Факториала отрицательного числа не существует");
        }
        if (i == 1 || i == 0 ){
            return 1;
        }
        return i * apply (i-1);
    }
}
