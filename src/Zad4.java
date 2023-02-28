import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Zad4 {
    private List<String> players;
    private List<List<Double>> scores;

    public Zad4() {
        players = new ArrayList<>();
        scores = new ArrayList<>();
    }

    public void addPlayer(String name) {
        players.add(name);
        scores.add(new ArrayList<>());
        //System.out.println("Dodano " + name + " jako nowego gracza.");
    }

    public void addScoreToPlayer(String name, Double score) {
        int index = players.indexOf(name);
        if (index == -1) {
            System.out.println("Nie znaleziono gracza.");
        } else {
            scores.get(index).add(score);
            //System.out.println("Dodano wynik " + score + " do gracza " + name);
        }
    }

    public List<Double> getHighestScoreForEachPlayer(){
        return scores.stream()
                .map(wyniki -> wyniki.stream()
                        .max(Comparator.naturalOrder())
                        .orElse(0.0))
                        .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        players.forEach(player -> sb
                        .append(player)
                        .append(", Wyniki: ")
                        .append(scores.get(players.indexOf(player)))
                        .append(System.lineSeparator()));
        return sb.toString();
    }
}
