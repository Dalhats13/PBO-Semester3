package exClass_Method;

public class Main {

    public static void main(String[] args) {
        List<String> glist = new List<String>(10);
        glist.add("corn");
        glist.add("tomatoes");
        System.out.println("Grocery list: " + glist.toString());

        List<Integer> numbers = new List<Integer>(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        System.out.println("Numbers: " + numbers.toString());
    }

}
