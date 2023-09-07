import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args){
//        List<String> countires = new ArrayList<>();
//
//        countires.add("india");
//        countires.add("switzerland");
//        System.out.println(countires);
//
////        Iterator it = countires.iterator();
//
////        while (it.hasNext()){
//////            it.remove();
//////            countires.add("china");
////            System.out.println(it.next());
////        }
//
//        ListIterator<String> it = countires.listIterator();
//        it.add("china");
//
//        while(it.hasNext()){
////            countires.add("china");
//            System.out.println(it.next());
//        }
//        while(it.hasPrevious()){
//            String country = it.previous();
//            if(country == "india"){
//                it.remove();
//            }
////            System.out.println(it.previous());
//        }
//        System.out.println(it.next());
//        System.out.println(it.previous());
//        System.out.println(countires);
//        Deque dq = new LinkedList();
//
        Deque skills = new LinkedList();
        skills.push("java");
        System.out.println(skills);
        skills.push("node-js");
        System.out.println(skills);
        skills.push("java1");
        System.out.println(skills);
        System.out.println(skills.pop());
//        System.out.println(skills.removeFirst());
    }
}
