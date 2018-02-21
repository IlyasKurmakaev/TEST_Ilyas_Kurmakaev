public class Main {

    public static void main(String[] args) {
        System.out.println(searchSubstring("ABCDEFG", "CD"));
    }
    public static boolean searchSubstring(String string,String substring) {
        if (substring.length() > string.length()){
            try {
                throw new Exception("Подстрока длиннее строки");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String temp;
        for (int i = 0; i <= string.length() - substring.length(); i++){
            temp = string.substring(i, substring.length() + i);
            if (temp.equals(substring)){
               return true;
            }
        }
        return false;
    }
}
