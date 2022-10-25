package Tutorial3;
import java.util.ArrayList;
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

    Map<String, String> rev_dict = new Hashtable<>() {{
        put("00011", "1");
        put("00101", "2");
        put("00110", "3");
        put("01001", "4");
        put("01010", "5");
        put("01100", "6");
        put("10001", "7");
        put("10010", "8");
        put("10100", "9");
        put("11000", "0");
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
        encodedZip = "|" + encodedZip + "|";
        return encodedZip;
    }
    public String decode(String zip) {
        int temp = 0;
        String holder = "";
        String decodedZip = "";
        ArrayList<String> codeArr = new ArrayList<>();
        zip = zip.substring(1, zip.length()-1);
        zip = zip.replace("|","1");
        zip = zip.replace(":", "0");
        for (int i = 5; i < zip.length(); i = i+5) {
            holder = zip.substring(temp,i);
            codeArr.add(holder);
            temp=i;
        }
        for (int j = 0; j < codeArr.size(); j++) {
            if (rev_dict.containsKey(codeArr.get(j))) {
                codeArr.set(j,rev_dict.get(codeArr.get(j)));
            }
        }
        for (int k = 0; k < codeArr.toArray().length; k++) {
            decodedZip = decodedZip + codeArr.get(k);
        }

        return decodedZip;
    }
}
