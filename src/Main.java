public class Main {

    public static void main(String[] args) {
        System.out.println(Nanasobeni.createNormalised(120, 12));
        System.out.println(Nasobeni.createNormalised(4, 12));
        System.out.println(new Nasobeni(2, 4).plus(new Nasobeni(3, 9)));
        System.out.println(new Nasobeni(2, 4).minus(new Nasobeni(3, 9)));
        System.out.println(new Nasobeni(2, 4).times(new Nasobeni(3, 9)));
        System.out.println(new Nasobeni(2, 4).dividedBy(new Nasobeni(3, 9)));
    }
}
