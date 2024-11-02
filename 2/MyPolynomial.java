public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length - 1;
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial other) {
        int maxLength = Math.max(this.coeffs.length, other.coeffs.length);
        double[] newCoeffs = new double[maxLength];
        for (int i = 0; i < maxLength; i++) {
            double thisCoeff = (i < this.coeffs.length) ? this.coeffs[i] : 0;
            double otherCoeff = (i < other.coeffs.length) ? other.coeffs[i] : 0;
            newCoeffs[i] = thisCoeff + otherCoeff;
        }
        return new MyPolynomial(newCoeffs);
    }
    public MyPolynomial multiply(MyPolynomial other) {
        int newDegree = this.getDegree() + other.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < other.coeffs.length; j++) {
                newCoeffs[i + j] += this.coeffs[i] * other.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i != coeffs.length - 1) {
                sb.append("+");
            }
            sb.append(coeffs[i]);
            if (i > 0) {
                sb.append("x^").append(i);
            }
        }
        return sb.toString();
    }
}

