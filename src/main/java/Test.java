package main.java;

public class Test {
    public static void main(String[] args) {
        FixSizeCollection<Integer> integerFixSizeCollection =new FixSizeCollection<>();
        FixSizeCollection<String> stringFixSizeCollection =new FixSizeCollection<>(20);
        for (int i = 0; i < 50 ; i++) {
            integerFixSizeCollection.add(i);
            System.out.println(integerFixSizeCollection);
        }



    }
}
