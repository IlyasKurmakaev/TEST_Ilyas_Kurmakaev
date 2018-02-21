public class Main {
    public static void main(String[] args) {
        System.out.println(palindrom("cat"));
    }

    public static boolean palindrom (String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str).reverse();
        String secondStr = stringBuilder.toString();
        return str.equals(secondStr);
    }
}
