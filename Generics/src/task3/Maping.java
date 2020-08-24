package task3;


import java.util.ArrayList;
import java.util.List;

public class Maping<K, V> {

    private List<Pair<K, V>> pairs = new ArrayList<>();

    public void add(K k, V v) {
        pairs.add(new Pair<>(k, v));
    }

    public V get(K k) {
        return pairs.stream()
                .filter(x -> x.getK().equals(k))
                .findAny()
                .get()
                .getV();
    }

}
