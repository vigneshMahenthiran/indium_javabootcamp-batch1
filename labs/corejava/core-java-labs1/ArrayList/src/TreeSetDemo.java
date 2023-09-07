import java.util.TreeSet;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
//        Skills java = new Skills(5,"java");
//        Skills node = new Skills(5,"node-js");
//        Skills golang = new Skills(5,"go");
        Set<String> skill = new TreeSet<>();
        skill.add("java");
        skill.add("node-js");
        skill.add("golang");
        skill.add("ajax");
        skill.add("Java");
        System.out.println(skill);
    }
}
