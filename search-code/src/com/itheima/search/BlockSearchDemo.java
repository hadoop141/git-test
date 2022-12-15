package com.itheima.search;

//目标：掌握分块查找的思想
//分块查找的过程：
//1. 需要把数据分成N多小块，块与块之间不能有数据重复的交集。
//2. 给每一块创建对象单独存储到数组当中
//3. 查找数据的时候，先在数组查，当前数据属于哪一块
//4. 再到这一块中顺序查找

public class BlockSearchDemo {

    public static void main(String[] args) {

        int[] arr = {16, 5, 9, 12,21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};
        //把数组分为3块，每块中存储最大值max，起始索引startIndex，结束索引endIndex
        Block block1 = new Block(21,0,5);
        Block block2 = new Block(45,6,11);
        Block block3 = new Block(73,12,17);

        Block[] blocks = {block1,block2,block3};
        int index = getIndex(arr, 8, blocks);
        System.out.println(index);


    }

    //设计一个静态方法，getIndex（） 找到元素所在的索引、
    //参数    arr[] number blocks
    //返回值   index
    private static int getIndex(int[] arr,int number,Block[] blocks){
        //设计一个静态方法findBlockIndex(),找到number在哪个block中
        Block block = findBlock(blocks, number);
        //判断block是否为空，如果为空，则说明没找到
        if (block == null){
            throw new RuntimeException(number + " 不存在");
        }
        //找到了对应的block
        //遍历数组中的数据  起始索引startIndex， 结束索引endIndex
        int start = block.getStartIndex();
        int end = block.getEndIndex();
        for (int i = start;i <= end;i++){
            if (arr[i]==number){
                return i;
            }
        }

        return -1;
    }

    //参数      blocks  number
    //返回值    block
    private static Block findBlock(Block[] blocks,int number){

        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMax() ){
                return blocks[i];
            }
        }

        return null;
    }


}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
