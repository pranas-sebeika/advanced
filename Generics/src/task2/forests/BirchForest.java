package task2.forests;

import task2.deciduous.trees.Birch;

public class BirchForest<T extends Birch> {

    private T[] arrayOfTrees;

    public BirchForest(T[] arrayOfTrees) {
        this.arrayOfTrees = arrayOfTrees;
        System.out.println(getClass().getSimpleName());
        for (T t: arrayOfTrees) {
            t.has();
        }
    }
}
