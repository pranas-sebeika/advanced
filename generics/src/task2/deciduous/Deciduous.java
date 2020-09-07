package task2.deciduous;

import task2.Tree;

public class Deciduous extends Tree {
    @Override
    public void has() {
        System.out.println(getClass().getSimpleName() + " has leafs");
    }
}
