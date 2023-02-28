import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;

public class Zad4Map {
    private final Map<String, List<Double>> playerMap;

    public Zad4Map() {
        playerMap = new HashMap<>();
    }

    public void addPlayer(String name) {
        playerMap.put(name, new ArrayList<>());
    }

    public void addScoreToPlayer(String name, Double score) {
        playerMap.get(name).add(score);
    }

    public List<Double> getHighestScoreOfEachPlayer() {
        return playerMap.values()
                .stream()
                .map(Collections::max)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        playerMap.keySet().forEach(key -> {
            sb.append(key).append(", Wyniki: ").append(playerMap.get(key)).append(System.lineSeparator());
        });
        return sb.toString();
    }
}
