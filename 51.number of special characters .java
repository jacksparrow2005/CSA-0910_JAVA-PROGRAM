public class SpecialCharacterCounter {
    public static void main(String[] args) {
        String givenStatement = "Modi Birthday @ September 17, #&$% is the wishes code for him.";

        int specialCharacterCount = countSpecialCharacters(givenStatement);

        System.out.println("Number of special Characters: " + specialCharacterCount);
    }

    private static int countSpecialCharacters(String str) {
        int specialCharacterCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacterCount++;
            }
        }

        return specialCharacterCount;
    }
}
OUTPUT:
Number of special Characters: 7
