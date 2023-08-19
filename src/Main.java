public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[]{
                new Product("Acqua", 321, 12),
                new Product("Vino", 654, 5),
                new Product("Biscotti", 987, 8),
        };
        String[] productsNameArray = new String[3];
        productsNameArray[0] = productsArray[0].getName();
        productsNameArray[1] = productsArray[1].getName();
        productsNameArray[2] = productsArray[2].getName();
        Methods.printLastLetters(productsNameArray);
        System.out.println(Methods.concatenateLastLetters(productsNameArray));
    }

}
