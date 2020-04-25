package study.list2;

public class main {
    public static void main(String[] args) {
        linklist linklist = new linklist();
        linklist.addNode(new Node(1,22));
        linklist.addNode(new Node(2,666));
        linklist.addNode(new Node(3,2333));
        linklist.display();
        linklist.addNode(new Node(2,3));
        linklist.display();
        System.out.println(linklist.search(22));
    }
}
