import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDeueueDemo {
    public static void main(String[] args) {
        Skills java = new Skills(5,"java");
        Skills node = new Skills(5,"node-js");
        Skills golang = new Skills(5,"go");
        Deque<Skills> skillSet = new LinkedList();
        skillSet.push(java);
        skillSet.push(node);
        skillSet.push(golang);
        System.out.println(skillSet);
        System.out.println(skillSet.pop());
    }
}
