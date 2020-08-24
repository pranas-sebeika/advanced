package task2;

import task2.coniferous.*;
import task2.coniferous.trees.*;
import task2.deciduous.trees.*;
import task2.forests.*;

public class Main {

    public static void main(String[] args) {

        Tree[] trees = {new Oak(), new Birch(), new Pine(), new Juniper()};
        Conifer[] conifers = {new Pine(), new Juniper()};
        Birch[] birches = {new Birch(), new Birch()};

        MixedForest<Tree> mixedForest = new MixedForest<>(trees);
        System.out.println();
        ConiferousForest<Conifer> coniferousForest = new ConiferousForest<>(conifers);
        System.out.println();
        BirchForest<Birch> birchForest = new BirchForest<>(birches);
    }

}
