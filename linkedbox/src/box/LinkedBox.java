package box;

import java.lang.annotation.Target;

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
        //设计一个小弟方法 小A,把节点插入到链表尾部,调用小弟方法 小A
        this.linkedLast(data);
        return true;
    }

    //设计一个方法，取数据
    public int get(int index) {
        //先判断index是否合法
        //设计一个小弟方法 小B 判断index是否合理
        this.rangeCheck(index);
        //设计一个小弟方法 小C 来获取节点
        Node node = this.getNode(index);
        //返回node的data
        return node.data;
    }

    //设计一个小弟方法 小B 判断index是否合理
    //参数    index 索引
    //返回值   void
    private void rangeCheck(int index) {
        if (index < 0 || index > size - 1) {
            throw new BoxIndexOutOfBoundException("index:" + index + " size: " + size);
        }
    }

    //设计一个小弟方法 小C 来获取节点
    //参数    index
    //返回值   targetNode
    private Node getNode(int index) {
        //创建一个节点来接收数据
        Node targetNode;
        //因为linkedbox是一个双向链表，有两个指针，first和last，所以就说明它可以双向遍历，
        // 那么怎么判断是从头开始还是从尾开始呢？    size的一半 可以用size/2 也可以 size>>1(向右移一位）
        if (index < size >> 1) {
            // 从头遍历，找到index的前一个
            // 它的next域就指向index，再让targetNode指向index所在节点
            targetNode = first ;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
        }else {
            //从前往后遍历，找到index的后一个
            // 它的pre域就指向index，再让targetNode指向index所在节点
            targetNode = last ;
            for (int i = size - 1; i > index ; i--) {
                targetNode = targetNode.pre;
            }
        }
        //返回targetNode
        return targetNode;
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