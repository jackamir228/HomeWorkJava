package homework8.ex4;

public class NRZEncoding {

    // Метод для кодирования текста в NRZ
    public static String nrzEncode(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            String binaryChar = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
            for (char bit : binaryChar.toCharArray()) {
                encodedText.append(bit == '0' ? "-" : "_");
            }
            encodedText.append(" ");
        }
        return encodedText.toString().trim();
    }

    public static void main(String[] args) {
        String word = "гильманов";
        String nrzWord = nrzEncode(word);
        System.out.println("NRZ код для слова 'гильманов': " + nrzWord);
    }
}

