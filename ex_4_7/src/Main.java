// Напишите алгоритм поиска «следующего» узла для заданного узла в бинарном дереве поиска.
// Считайте, что у каждого узла есть ссылка на его родителя.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"a", "b", "c", "d", "e", "f"};
        Projects projects = new Projects(List.of(names));
        projects.addParent("d", "a");
        projects.addParent("b", "f");
        projects.addParent("d", "b");
        projects.addParent("a", "f");
        projects.addParent("c", "d");

        System.out.println("root if f is " + projects.getRoot("f"));
        System.out.println("root if a is " + projects.getRoot("a"));
        System.out.println("root if b is " + projects.getRoot("b"));
        System.out.println("root if d is " + projects.getRoot("d"));
        System.out.println("root if c is " + projects.getRoot("c"));
        System.out.println("root if e is " + projects.getRoot("e"));

//        System.out.println("delete f");
//        projects.delete("f");
//
//        System.out.println("root if f is " + projects.getRoot("f"));
//        System.out.println("root if a is " + projects.getRoot("a"));
//        System.out.println("root if b is " + projects.getRoot("b"));
//        System.out.println("root if d is " + projects.getRoot("d"));
//        System.out.println("root if c is " + projects.getRoot("c"));
//        System.out.println("root if e is " + projects.getRoot("e"));

        System.out.println("---");
        for (String name : projects.topSort()) {
            System.out.println(name);
        }
    }
}
