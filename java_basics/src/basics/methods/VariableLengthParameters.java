package basics.methods;

public class VariableLengthParameters {
    public static int sum(int ...a){
        int sum = 0;
        for(int ele: a){
            sum += ele;
        }

        return sum;
    }

    public static void greet(String name, int ...people){
        System.out.println(String.format("%s, says hello to %d people", name, people.length));
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4, 5));
        greet("Amrik", 3, 4, 2, 1, 5);
    }
}
