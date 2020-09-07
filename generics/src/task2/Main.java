package task2;

import task2.coniferous.Conifer;
import task2.coniferous.trees.Juniper;
import task2.coniferous.trees.Pine;
import task2.deciduous.trees.Birch;
import task2.deciduous.trees.Oak;
import task2.forests.BirchForest;
import task2.forests.ConiferousForest;
import task2.forests.MixedForest;

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
