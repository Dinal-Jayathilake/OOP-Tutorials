package Tutorial3;
import java.util.Hashtable;
import java.util.Map;

public class USPostal {
    String encodedZip = "";
    Map<String, String> dict = new Hashtable<>() {{
        put("1", "00011");
        put("2", "00101");
        put("3", "00110");
        put("4", "01001");
        put("5", "01010");
        put("6", "01100");
        put("7", "10001");
        put("8", "10010");
        put("9", "10100");
        put("0", "11000");
    }};
    public String checkDigit(String zip) {
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < zip.length(); i++) {
            sum = sum + Character.getNumericValue(zip.charAt(i));
        }
        while (sum % 10 != 0) {
            sum++;
            digit++;
        }
        return Integer.toString(digit);
    }
    public String encode(String zip) {
        zip = zip + checkDigit(zip);
        System.out.println(zip);
        System.out.println(zip.length());
        for (int i = 0; i < zip.length(); i++) {
            String character = Character.toString(zip.charAt(i));
            if (dict.containsKey(character)) {
                for (int j = 0; j < zip.length()-1; j++) {
                    if ((dict.get(character).charAt(j)=='0')) {
                        encodedZip = encodedZip + ":";
                    } else {
                        encodedZip = encodedZip + "|";
                    }
                }
            }
        }
        return encodedZip;
    }
}
