public class Nasobeni implements Nanasobeni {

    private final Integer numerator;
    private final Integer denominator;

    public Nasobeni(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    public static Nasobeni createNormalised(Integer numerator, Integer denominator) {
        try {
            for (int i = denominator / 2; i > 0; i--) {
                if (denominator % i == 0 && numerator % i == 0) {
                    return new Nasobeni(numerator / i, denominator / i);
                }
            }
            throw new Exception();
        } catch (Exception e) {
            return new Nasobeni(numerator, denominator);
        }

    }

    private static Integer findGreatestCommonDenominator(Integer i1, Integer i2) {
        if (i1 < i2) return findGreatestCommonDenominator(i2, i1);
        if (i2 == 0) return i1;
        return findGreatestCommonDenominator(i2, i1 % i2);
    }

    private static Integer findLowestCommonMultiple(Integer i1, Integer i2) {
        if (i1 == 0 || i2 == 0) return 0;
        else {
            int gcd = findGreatestCommonDenominator(i1, i2);
            return Math.abs(i1 * i2) / gcd;
        }
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public Nanasobeni plus(Nanasobeni other) {
        int b = getDenominator();
        int a = getNumerator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new Nasobeni((a * d) + (b * c), b * d);
    }

    @Override
    public Nanasobeni minus(Nanasobeni other) {
        int b = getDenominator();
        int a = getNumerator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new Nasobeni((a * d) - (b * c), b * d);
    }

    @Override
    public Nanasobeni times(Nanasobeni other) {
        int b = getDenominator();
        int a = getNumerator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new Nasobeni(a * c, b * d);
    }

    @Override
    public Nanasobeni dividedBy(Nanasobeni other) {
        int b = getDenominator();
        int a = getNumerator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new Nasobeni(a * d, b * c);
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}