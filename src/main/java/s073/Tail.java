package s073;

public class Tail {
    private int size;

    public Tail(int size) {
        this.size = size;  //non posso scrivere int x = tail.size perché size è privato
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Tail [size=" + size + "]";
    }
}
