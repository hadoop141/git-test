package box;


public class LinkedBox<T> {

    //设计一个属性来表示链表中的有效数据的个数size
    private int size;
    //属性： first 代表头指针
    private Node<T> first;
    // last 代表 尾指针
    private Node<T> last;

    //设计一个方法，返回链表中的有效个数size
    public int size() {
        return size;
    }


    //设计一个方法，存储数据
    public boolean add(T data) {
        //设计一个小弟方法 小A,把节点插入到链表尾部,调用小弟方法 小A
        this.linkedLast(data);
        return true;
    }

    //设计一个方法，取数据
    public T get(int index) {
        //先判断index是否合法
        //设计一个小弟方法 小B 判断index是否合理
        this.rangeCheck(index);
        //设计一个小弟方法 小C 来获取节点
        Node<T> node = this.getNode(index);
        //返回node的data
        return node.data;
    }

    //设计一个方法，删除节点
    public T remove(int index) {
        //检测index是否合法
        this.rangeCheck(index);
        //根据索引index，找到对应节点，调用getNOde（） 方法
        Node<T> node = this.getNode(index);
        //设计一个小弟方法，小D 对链表做出改变,并得到节点的值
        T data = this.delete(node);
        //调用get（）方法获得要删除位置的数据
        return data;
    }

    //设计一个小弟方法，小D 对链表做出改变
    private T delete(Node<T> node) {
        //定义两个节点 pre next 分别代表 node的 pre域 和 node的 next域
        Node<T> pre = node.pre;
        Node<T> next = node.next;
        T data = node.data;
        //打断前半部分的链子
        // 判断node是否为first
        if (pre == null) { // node是 首节点first
            first = next;  //直接让 first 指向 下一个节点
        } else { // 不是first ，可能在中间，也可能是last
            pre.next = next; // 让我前面的节点 pre的next域 指向 我后面的节点next
            node.pre = null;
        }
        //打断后半部分的链子
        // 判断node是否为last
        if (next == null) { // node是 尾节点last
            last = pre; //让last 指向 node的前一个结点 pre
        } else {
            next.pre = pre; // 让我后面的节点 next 的pre域指向我前面的节点 pre
            node.next = null;
        }
        // 删除完毕后，链表有效个数减一
        size--;
        return data;
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
    private Node<T> getNode(int index) {
        //创建一个节点来接收数据
        Node<T> targetNode;
        //因为linkedbox是一个双向链表，有两个指针，first和last，所以就说明它可以双向遍历，
        // 那么怎么判断是从头开始还是从尾开始呢？    size的一半 可以用size/2 也可以 size>>1(向右移一位）
        if (index < size >> 1) {
            // 从头遍历，找到index的前一个
            // 它的next域就指向index，再让targetNode指向index所在节点
            targetNode = first;
            for (int i = 0; i < index; i++) {
                targetNode = targetNode.next;
            }
        } else {
            //从前往后遍历，找到index的后一个
            // 它的pre域就指向index，再让targetNode指向index所在节点
            targetNode = last;
            for (int i = size - 1; i > index; i--) {
                targetNode = targetNode.pre;
            }
        }
        //返回targetNode
        return targetNode;
    }


    //设计一个小弟方法 小A,把节点插入到 链表尾部
    //参数：   data
    //返回值：  void
    private void linkedLast(T data) {
        //因为是从链表的尾部插入节点
        //定义一个临时变量 t 指向last
        Node<T> t = last;
        //创建一个Node节点，pre指向 t ，next为null
        Node<T> node = new Node(t, data, null);
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

    //内部类：将一个类放在另一个类的内部，（属性/方法并列----全局  属性/方法的内部-----局部）
    //Node是LinkedBox的全局内部类
    //  省略了一个Java类文件
    //  只有当前的LinkedBox类用得到，别人用不到
    //  隐藏了底层存储的机制

    // 是一个非常简单的对象
    // 只负责存储真实的数据，上一个节点的地址，下一个结点的地址

    //链表中的一个节点
    private class Node<T> {

        // 属性：data 数据
        T data;
        // 属性：next 指向下一个节点
        Node<T> next;
        // 属性：pre  指向上一个节点
        Node<T> pre;

        //有参构造器
        public Node(Node<T> pre,T data,Node<T> next){
            this.pre = pre;
            this.data = data;
            this.next = next;
        }
    }


}