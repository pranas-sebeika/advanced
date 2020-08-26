package task2.forests;

import task2.coniferous.Conifer;

public class ConiferousForest<T extends Conifer> {

    private T[] arrayOfTrees;

    public ConiferousForest(T[] arrayOfTrees) {
        this.arrayOfTrees = arrayOfTrees;
        System.out.println(getClass().getSimpleName());
        for (T t: arrayOfTrees) {
            t.has();
        }
    }
}
