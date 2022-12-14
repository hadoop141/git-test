package box;

//链表中的一个节点
public class Node {

    // 属性：data 数据
    public int data;
    // 属性：next 指向下一个节点
    public Node next;
    // 属性：pre  指向上一个节点
    public Node pre;

    public Node(Node pre,int data,Node next){
        this.pre = pre;
        this.data = data;
        this.next = next;
    }
}
