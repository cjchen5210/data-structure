package study.list;

public class sqList implements list{
    private int curLen;             //当前长度
    private Object[] list;          //建立新的数组，也是顺序表

    //建立新的顺序表，长度为maxSize
    public sqList(int maxSize){
        curLen = 0;
        list = new Object[maxSize];
    }

    @Override //重写接口方法，清空顺序表
    public void clear() {
        curLen = 0;
    }

    @Override //判断顺序表是否为空
    public boolean isEmpty() {
        boolean a = false;
        if(curLen == 0){
            return a = false;
        }
        else return a = true;
    }

    @Override //计算当前顺序表的长度
    public int length() {
        return curLen;
    }

    @Override //查找第i个元素
    // 但是个人觉得缺少else代码，编译之后看情况
    public Object get(int i) throws Exception {
        if (i < 0 || i > curLen - 1) {
            throw new Exception("第" + i + "元素不存在");
        }
        else return list[i];
    }

    @Override  //在顺序表中插入元素
    //当前长度和表的大小有概念混淆
    public void insert(int i, int obj) throws Exception {
        if(curLen == list.length){
            throw new Exception("线性表满了");
        }
        else if(i < 0 || i > curLen){
            throw new Exception("插入位置不合理");
        }
        else {
            for(int j = curLen ; j > i ; j--){
                list[j] = list[j-1];
            }
            list[i] = obj;
            curLen++;
        }
    }

    @Override  //删除第i个元素
    public void remove(int i) throws Exception {
        if(i < 0 || i > curLen){
            throw new Exception("删除元素不合理");
        }
        else{
            for(int j = i ; j < curLen -1 ;j++){
                list[j] = list[j+1];
            }
            curLen--;
        }
    }


    @Override //找到元素x第一次出现的位置
    //不知道啥意思，先写上吧
    public int index(int x) throws Exception {
        int i = 0;
        while (i < curLen && !list[i].equals(x)){
            i++;
        }
        if(i < curLen){
            return i;
        }
        else return -1;
    }

    @Override  //显示顺序表
    public void display() {
        for(int i = 0; i < curLen;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }

}
