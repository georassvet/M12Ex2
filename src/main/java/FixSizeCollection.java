package main.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class FixSizeCollection<T> implements Collection<T> {

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
    @Override
    public boolean remove(Object obj){
       if(obj==)
        for (int i = 0; i < 10; i++) {

        }
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

    @Override
    public int size() {
        return pos;
    }

    @Override
    public boolean isEmpty() {
        return pos==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
