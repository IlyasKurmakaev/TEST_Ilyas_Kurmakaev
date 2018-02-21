public class Main {
    public static void main(String[] args) {
        System.out.println(compressionStroki("aaabbccdd"));
    }
    public static String compressionStroki(String str){
        String shortStr = "";
        String letter = str.substring(0, 1);
        int repitTime = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.substring(i, i+1).equals(str.substring(i+1, i+2))){
                repitTime++;
                if(i == str.length() - 2){
                    shortStr = shortStr.concat(letter.concat(String.valueOf(repitTime)));
                }
            }
            else{
                shortStr = shortStr.concat(letter.concat(String.valueOf(repitTime)));
                repitTime = 1;
                letter = str.substring(i+1, i+2);
            }
        }
        return shortStr;
    }
}
