package study.list2;

public interface list {
    public void addNode(Node insertNode);
    public int length();
    public int find(int i);
    public int search(int key);
    public void insert(Node node);
    public void delete(int i);
    public void display();
    public void update(Node updateNode);
    //public void upData(Node node);
}
