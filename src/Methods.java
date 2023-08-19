public class Methods {
    public static void printLastLetters(String[] obj) {
        for (String element : obj) {
            System.out.println(element.charAt(element.length() - 1));
        }
    }

    public static String concatenateLastLetters(String[] obj) {
        String result = "";
        for (String element : obj) {
            result += element.charAt(element.length() - 1);
        }
        return result;
    }
}
