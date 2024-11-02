public class Main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        System.out.println("Polynomial p1: " + p1);
        System.out.println("Degree of p1: " + p1.getDegree());
        System.out.println("p1 evaluated at x=2: " + p1.evaluate(2));
        MyPolynomial p2 = new MyPolynomial(4.4, 5.5, 6.6);
        System.out.println("Polynomial p2: " + p2);
        System.out.println("Degree of p2: " + p2.getDegree());
        System.out.println("p2 evaluated at x=2: " + p2.evaluate(2));
        MyPolynomial sum = p1.add(p2);
        System.out.println("Sum of p1 and p2: " + sum);
        MyPolynomial product = p1.multiply(p2);
        System.out.println("Product of p1 and p2: " + product);
    }
}
