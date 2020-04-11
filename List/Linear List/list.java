package study.list;

public interface list{
    public void clear();
    public boolean isEmpty();
    public int length();
    public Object get(int i) throws Exception;
    public void insert(int i ,int obj) throws Exception;
    public void remove(int i) throws Exception;
    public int index(int x) throws Exception;
    public void display();

}
