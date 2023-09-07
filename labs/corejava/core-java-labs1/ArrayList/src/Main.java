import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.*;

public class Main extends Skills {
    public static void main(String[] args) {
//        skill java = new Skills()
//        ArrayList skills = new ArrayList();
//        List skills = new ArrayList();
////        Collection skills = new ArrayList();
//        skills.add("java");
//        skills.add("node js");
//        skills.add("java");
//        skills.add(100);
//        // adding new element in index
//        skills.add(1,"php");
//        skills.set(4,"spring");
//        skills.remove(true);
//        skills.remove(5);
//        System.out.println("printing directly");
//        System.out.println(skills);
//        System.out.println("printing using for each loop");
//        for(Object skill : skills){
//            if(skill instanceof String){
//                System.out.println(((String) skill).toUpperCase() );
//            }
//            else {
//                System.out.println(skill);
//            }
//        }
//        System.out.println("printing using iterator");
//        Iterator it = skills.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        Skills java = new Skills(5,"java");
        Skills node = new Skills(5,"node-js");
        Skills golang = new Skills(5,"go");
//        List skillSet = new ArrayList<>();
//        skillSet.add(java);
//        skillSet.add(node);
//        Iterator its = skillSet.iterator();
//        while (its.hasNext()){
//            System.out.println(its.next());
//        }
        Queue<Skills> skillSet = new LinkedList();
        skillSet.offer(java);
        skillSet.offer(node);
        skillSet.offer(golang);
        System.out.println(skillSet);
        System.out.println(skillSet.peek());

    }
}