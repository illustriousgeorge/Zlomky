public interface Nanasobeni {

    Integer getNumerator();
    Integer getDenominator();
    Nanasobeni plus(Nanasobeni other);
    Nanasobeni minus(Nanasobeni other);
    Nanasobeni times(Nanasobeni other);
    Nanasobeni dividedBy(Nanasobeni other);
}