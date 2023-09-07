import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetWithDemo {
    public static void main(String[] args) {
        Skills java = new Skills(5,"java");
        Skills node = new Skills(5,"node-js");
        Skills golang = new Skills(5,"go");

        Set<Skills> skills = new HashSet();
        skills.add(java);
        skills.add(node);
        skills.add(golang);
        System.out.println(skills.size());
        System.out.println(skills);
        Iterator<Skills> it = skills.iterator();
        while (it.hasNext()){
            Skills skill = it.next();
            System.out.println(skill + " "+skill.hashCode());
        }
    }
}
