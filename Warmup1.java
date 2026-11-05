//Is a palendrome?
//Incomplete

public class Warmup1 {
     public static boolean isPalendrome(int x) {
        if (x <= 0 || x == null){
            return false;
        }

        String xStr = x + "";
        String half1 = xStr.substring(0, xStr.length() + 1);
        String half2 = xStr.substring(xStr.length());
        String addChar;

        //Reverse half2
        for (i = 0; i < half2.length(); i++){
            half2 = xStr.substring(xStr.length());
        }

        if (half1.equals(half2)) {
            return true;
        }

        return false;
     }

     public static void main(String[] args) {
        System.out.println(isPalendrome(121));

        System.out.println(isPalendrome(120));
     }
}