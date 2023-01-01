package com.itheima.myset;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    private int Chinese;
    private int math;
    private int English;


    public Student2() {
    }

    public Student2(String name, int age, int Chinese, int math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.math = math;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    public int getSum(){
        return this.getChinese() + this.getEnglish() + this.getMath();
    }
    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", math = " + math + ", English = " + English + ", sum = "+getSum()+" }";
    }

    @Override
    // 按照总分从高到低输出到控制台
    // 如果总分一样，按照语文成绩排
    // 如果语文一样，按照数学成绩排
    // 如果数学成绩一样，按照英语成绩排
    // 如果英文成绩一样，按照年龄排,年龄小的排前面
    // 如果年龄一样，按照姓名的字母顺序排
    // 如果都一样，认为是同一个学生，不存
    public int compareTo(Student2 o) {
        int sum1 = this.getSum();
        int sum2 = o.getSum();
        int i = sum2 - sum1;
        i = i == 0 ? o.getChinese() - this.getChinese() : i;
        i = i == 0 ? o.getMath() - this.getMath() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? o.getName().compareTo(this.getName()) : i;
        return i;
    }
}
