package box;

public class LinkedBox {

    //设计一个属性来表示链表中的有效数据的个数size
    private int size;
    //属性： first 代表头指针
    private Node first;
    // last 代表 尾指针
    private Node last;

    //设计一个方法，返回链表中的有效个数size
    public int size() {
        return size;
    }


    //设计一个方法，存储数据
    public boolean add(int data) {
        //设计一个小弟方法 小A,把节点插入到链表尾部
        this.linkedLast(data);
        return true;
    }

    //设计一个小弟方法 小A,把节点插入到 链表尾部
    //参数：   data
    //返回值：  void
    private void linkedLast(int data) {
        //因为是从链表的尾部插入节点
        //定义一个临时变量 t 指向last
        Node t = last;
        //创建一个Node节点，pre指向 t ，next为null
        Node node = new Node(t, data, null);
        //last 指向把当前节点
        last = node;
        //判断链表是否为空
        if (t == null) {  //原来的链表为空 没有数据，当前节点node既是 first 也是 last，
            first = last;
        } else {      //链表中有数据,不为空
            //让 t的next域指向last
            t.next = last;
        }
        //数据插入到链表尾部，size+1
        size++;
    }
}