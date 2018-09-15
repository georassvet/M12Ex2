package main.java;

public class FixSizeCollection<T>{

    private static final int FIXED_SIZE = 16;
    private Object[] array;
    private int pos;

   public FixSizeCollection(){
       this(FIXED_SIZE);
   }

   public FixSizeCollection(int size){
       array=new Object[size];
   }
   public boolean add(T obj){
        if(pos >= array.length) {
           resize();
           pos--;
        }
            array[pos++] = obj;
        return true;
    }
    private void resize(){
        System.arraycopy(array, 1, array, 0, array.length-1);
    }
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < pos; i++) {
            string.append(array[i]).append(", ");
        }
        String result = string.toString();
        result = result.replaceFirst("[, \\t]+$", "");
        return result + "]";
    }
}
