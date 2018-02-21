public class Main {
    public static void main(String[] args) {
        System.out.println(deploymentString("3a1b2c2d"));
    }
    public static String deploymentString(String str){
        String returnStr = new String();
        for (int i = 0; i <= str.length()-1; i+=2 ){
            for (int j = 0; j <  Integer.parseInt(str.substring(i, i+1)); j++){
                returnStr = returnStr.concat(str.substring(i+1, i+2));
            }
        }
        return returnStr;
    }
}
