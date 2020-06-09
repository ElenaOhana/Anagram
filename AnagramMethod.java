import java.util.Arrays;

public class AnagramMethod{
     private boolean validAnagram(String str, String pair) {
        if(str.length() != pair.length()) {
            return  false;
        }
        char[] strArr = str.toCharArray();
        char[] pairArr = pair.toCharArray();

        Arrays.sort(strArr);
        str = new String(strArr);

        Arrays.sort(pairArr);
        pair = new String(pairArr);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != pair.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public void start() {
        boolean b = validAnagram("kakamayka", "myakakaka");
        System.out.println(b);
    }
}
