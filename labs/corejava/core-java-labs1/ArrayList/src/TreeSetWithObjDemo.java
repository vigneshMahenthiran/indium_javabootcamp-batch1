import java.util.HashSet;
import java.util.*;
public class TreeSetWithObjDemo {


    public static void main(String[] args) {
        Skills java = new Skills(5,"java");
        Skills node = new Skills(5,"node-js");
        Skills golang = new Skills(5,"go");

        Set<Skills> skill = new TreeSet<>();
        skill.add(java);
        skill.add(node);
        skill.add(golang);
        System.out.println(skill);

    }
}
