import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        String number1 = "11111111111111111111111111111111111111111111111111111111111111";
        String number2 = "22222222222222222222222222222222222222222222222222";
        BigInteger i1 = new BigInteger(number1);
        BigInteger i2 = new BigInteger(number2);
        BigInteger sum = i1.add(i2);
        BigInteger product = i1.multiply(i2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
