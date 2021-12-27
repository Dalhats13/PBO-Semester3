package exBounded;

public class Main<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Main<Integer> IntegerBound = new Main<Integer>();
        IntegerBound.add(new Integer(10));
        IntegerBound.inspect(20);
    }
}


