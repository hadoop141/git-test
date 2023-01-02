package args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //可变参数的小细节：
        //1.在方法的形参中，最多只能有一个可变参数
        //可变参数，理解为一个大胖子，有多少，吃多少

        //2.在方法的形参中，如果除了可变参数以外，还有别的形参，那么可变参数要写在最后。
        //3.如果方法的形参中有可变参数，那么在调用方法的时候，可以不传参数作为可变参数，即可变参数的数量可以为0。
        int sum = getSum(1);
        System.out.println(sum);

    }

    public static int getSum(int a,int... args){
        int sum = a;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
