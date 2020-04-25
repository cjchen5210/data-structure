package study.list2;

public class linklist implements list{
    //定义头节点
    Node head = new Node(0,0);

    //添加节点
    @Override
    public void addNode(Node insertNode) {
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = insertNode;
    }

    public linklist() {
        super();
    }

    @Override
    public int length() {
        int length = 0;
        Node temp = head.next;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    @Override
    public int find(int i) {
        return 0;
    }

    //输出数据的id
    @Override
    public int search(int key) {
        Node temp = head.next;
        while (temp.data != key){
            temp = temp.next;
        }
        return temp.id;
    }

    //在第i个位置插入元素data
    @Override
    public void insert(Node node) {
        Node temp = head;
        while (temp.id != node.id){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    //删除节点i
    @Override
    public void delete(int i) {
        Node temp = head;
        while(temp.id != i-1){
            temp =temp.next;
        }
        temp.next = temp.next.next;
        if(temp == null){
            System.out.println("不存在节点i");
        }

    }

    //显示链表
    @Override
    public void display() {
        Node temp = head.next;
        if (temp.next == null){
            System.out.println("链表为空");
            return ;
        }
        while (temp != null){
            System.out.println(temp.id+" "+temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    //修改节点
    //还没写完
    @Override
    public void update(Node updateNode) {
        Node temp = head.next;
        if (temp.next == null){
            System.out.println("链表为空");
            return;
        }
        while (temp.id != updateNode.id){
            temp = temp.next;
        }
        if(temp.data == updateNode.data) {
            System.out.println("不用修改");
        }
        else{temp.data = updateNode.data;}

    }
}

