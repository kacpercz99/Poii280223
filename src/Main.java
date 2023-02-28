public class Main {
    public static void main(String[] args) {
        Zad4Map zad4Map = new Zad4Map();
        zad4Map.addPlayer("Kacper");
        zad4Map.addScoreToPlayer("Kacper",123.3d);
        zad4Map.addScoreToPlayer("Kacper",121.3d);
        zad4Map.addScoreToPlayer("Kacper",60.1d);
        zad4Map.addPlayer("Kamil");
        zad4Map.addScoreToPlayer("Kamil",69.7d);
        zad4Map.addScoreToPlayer("Kamil",30.3d);
        zad4Map.addScoreToPlayer("Kamil",50.1d);
        System.out.println("Zad4Map");
        System.out.println(zad4Map.getHighestScoreOfEachPlayer());
        System.out.println(zad4Map);
        System.out.println();
        Zad4 zad4 = new Zad4();
        zad4.addPlayer("Kacper");
        zad4.addScoreToPlayer("Kacper",123.3d);
        zad4.addScoreToPlayer("Kacper",121.3d);
        zad4.addScoreToPlayer("Kacper",60.1d);
        zad4.addPlayer("Kamil");
        zad4.addScoreToPlayer("Kamil",69.7d);
        zad4.addScoreToPlayer("Kamil",30.3d);
        zad4.addScoreToPlayer("Kamil",50.1d);
        System.out.println("Zad4");
        System.out.println(zad4.getHighestScoreForEachPlayer());
        System.out.println(zad4);
    }
}