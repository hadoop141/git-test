package box;

//链表中的一个节点
public class Node<T> {

    // 属性：data 数据
    public T data;
    // 属性：next 指向下一个节点
    public Node<T> next;
    // 属性：pre  指向上一个节点
    public Node<T> pre;

    public Node(Node<T> pre,T data,Node<T> next){
        this.pre = pre;
        this.data = data;
        this.next = next;
    }
}
