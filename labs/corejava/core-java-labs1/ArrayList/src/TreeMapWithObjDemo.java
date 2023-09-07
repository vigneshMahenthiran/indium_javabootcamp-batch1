import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class TreeMapWithObjDemo {
    public static void main(String[] args) {
        Comparator<String> Sort_By_Name = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
//                return o2.getName().compareTo(o1.getName());
                return o2.compareTo(o1);
            }
        };
        Map skillSet = new TreeMap<>(Sort_By_Name);

        Skills react = new Skills(4,"react");
        Skills java = new Skills(5,"java");
        Skills node = new Skills(6,"node-js");
        Skills golang = new Skills(7,"go");
        Skills mysql = new Skills(8,"mysql");

        skillSet.put(java.getName(),java);
        skillSet.put(node.getName(),node);
        skillSet.put(golang.getName(),golang);
        skillSet.put(react.getName(), react);
        skillSet.put(mysql.getName(), mysql);

        Set entries = skillSet.entrySet();

        for(Object entry : entries){
            System.out.println(entry);
        }


    }
}
