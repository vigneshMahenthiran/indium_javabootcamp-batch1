import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        Skills java = new Skills(5,"java");
        Skills node = new Skills(5,"node-js");
        Skills golang = new Skills(5,"go");
        Queue<Skills> skillSet = new LinkedList();
        skillSet.offer(java);
        skillSet.offer(node);
        skillSet.offer(golang);
        System.out.println(skillSet);
        System.out.println(skillSet.peek());
        System.out.println(skillSet.poll());
    }
}
