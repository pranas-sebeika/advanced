package task2.coniferous;

import task2.Tree;

public class Conifer extends Tree {
    @Override
    public void has() {
        System.out.println(getClass().getSimpleName() + " has needles");
    }
}
