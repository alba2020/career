import java.util.*;

public class Projects {

    protected HashMap<String, LinkedList<String>> parents;

    public Projects(Iterable<String> names) {
        parents = new HashMap<>();

        for (String name : names) {
            parents.put(name, new LinkedList<>());
        }
    }

    public void addParent(String project, String parent) {
        parents.get(project).add(parent);
    }

    public void print() {
        for(String name : parents.keySet()) {
            System.out.print(name + " <- ");
            for(String parent : parents.get(name)) {
                System.out.print(parent + " ");
            }
            System.out.println();
        }
    }

    public String getParent(String project) {
        LinkedList<String> parentsOfThisNode = parents.get(project);
        if (parentsOfThisNode == null || parentsOfThisNode.isEmpty())
            return null;

        String parentName = parentsOfThisNode.peekFirst();

        if (! parents.containsKey(parentName)) {
            parentsOfThisNode.remove(parentName);
            return getParent(project);
        }
        return parentName;
    }

    public String getRoot(String start) {
        String name = start;
        while(true) {
            String parent = getParent(name);
            if (parent == null) return name; // root
            if (parent.equals(start)) return null; // cycle
            name = parent;
        }
    }

    public void delete(String name) {
        parents.remove(name);
    }

    public Queue<String> topSort() {
        Queue<String> q = new ArrayDeque<>();

        while(parents.size() > 0) {
            String key = null;
            for (String k : parents.keySet()) { // get first key
                key = k;
                break;
            }
            q.add(getRoot(key));
            parents.remove(key);
        }
        return q;
    }
}
