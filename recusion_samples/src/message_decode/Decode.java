package message_decode;

public class Decode {

    /**
     *
     * @param s the string
     * @param start the start of string to start processing from
     * @return the no of decodes possible
     */
    public static int noOfDecodes(String s, int start) {
        if(start >= s.length())
            return 1;

        if(s.charAt(start) == '0')
            return 0;

        if((start + 1) < s.length()) {
            if(s.charAt(start) == '1') {
                return noOfDecodes(s, start + 1) + noOfDecodes(s, start + 2);
            }

            if(s.charAt(start) == '2' && s.charAt(start + 1) >= 48 && s.charAt(start + 1) <= 57) {
                return noOfDecodes(s, start + 1) + noOfDecodes(s, start + 2);
            }
        }

        return noOfDecodes(s, start + 1);
    }

    public static void main(String[] args) {
        String code = "1123103";
        System.out.println(noOfDecodes(code, 0));
    }
}
