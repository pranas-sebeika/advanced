package task2.forests;

import task2.Tree;

public class MixedForest<T extends Tree> {

    private T[] arrayOfTrees;

    public MixedForest(T[] arrayOfTrees) {
        this.arrayOfTrees = arrayOfTrees;
        System.out.println(getClass().getSimpleName());
        for (T t: arrayOfTrees) {
            t.has();
        }
    }

}
