import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class HashMapWithDemo {
    public static void main(String[] args) {
        Map<Integer,Skills> skillSet = new HashMap();
        Skills react = new Skills(4,"react");
        Skills java = new Skills(5,"java");
        Skills node = new Skills(6,"node-js");
        Skills golang = new Skills(7,"go");
        Skills mysql = new Skills(8,"mysql");

        skillSet.put(java.getId(),java);
        skillSet.put(node.getId(),node);
        skillSet.put(golang.getId(),golang);
        skillSet.put(react.getId(), react);
        skillSet.replace(7,mysql);
        System.out.println(skillSet);
        skillSet.remove(4);

        System.out.println(skillSet.size());
        System.out.println(skillSet);

//        Set<Map.Entry<Integer,Skills>> entries =
        Set entries = skillSet.entrySet();
      for(Object entry : entries){
          System.out.println(entry);
      }
      Set keys = skillSet.keySet();
      for(Object key : keys){
          System.out.println(key);
      }

      Collection values = skillSet.values();
      for(Object value: values){
          System.out.println(value);
      }

    }
}
