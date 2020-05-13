public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue(){
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity){
        elements = new int[capacity];
    }

    public void enqueue(int v){
        //array size 2배로 늘리기
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        //값 넣기
        elements[size++] = v;
    }

    public int dequeue(){
        //첫번째 element 리턴, 왼 쪽으로 한칸씩 shift
        int ret = elements[0];
        int[] temp = new int[--size];
        System.arraycopy(elements, 1, temp, 0, size);
        elements = temp;

        return ret;
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

}
