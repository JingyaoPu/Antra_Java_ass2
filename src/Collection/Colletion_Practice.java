package Collection;
import java.util.*;

/*
1. Write a Java program to update specific array element by given element.
2. Write a Java program to reverse elements in a array list.
3. Write a Java program to join two array lists.
4. Write a Java program to print all the elements of a ArrayList using the position of the elements.
5. Write a Java program to append the specified element to the end of a linked list.
6.  Write a Java program to insert the specified element at the end of a linked list.
7. Write a Java program to get the first and last occurrence of the specified elements in a linked
list.
8. Write a Java program to remove and return the first element of a linked list.
9. Write a Java program to iterate through all elements in a hash list.
10. Write a Java program to convert a hash set to an array.
11. Write a Java program to compare two sets and retain elements which are same on both sets.
12. Write a Java program to copy all of the mappings from the specified map to another map.
13. Write a Java program to test if a map contains a mapping for the specified key.
14. Write a Java program to get a set view of the keys contained in this map.
15. Write a Java program to get a reverse order view of the keys contained in a given map.
 */
public class Colletion_Practice {
    public static<T> void q1(T[] arr, T e1, T e2) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e1) {
                arr[i] = e2;
                break;
            }
        }
    }

    public static<T> void q2(ArrayList<T> al) {
        int l = 0;
        int r = al.size() - 1;
        while (l < r) {
            T temp = al.get(l);
            al.set(l, al.get(r));
            al.set(r, temp);
            l++;
            r--;
        }
    }

    public static<T> ArrayList<T> q3(ArrayList<T> l1, ArrayList<T> l2) {
        ArrayList<T> res = new ArrayList<>();
        res.addAll(l1);
        res.addAll(l2);
        return res;
    }

    public static<T> void q4(ArrayList<T> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

    public static<T> void q5(LinkedList<T> al, T e) {
        al.add(e);
    }

    public static<T> void q6(LinkedList<T> al, T e) {
        al.add(al.size(), e);
    }

    public static<T> int[] q7(LinkedList<T> al, T e) {
        int[] res = new int[2];
        res[0] = al.indexOf(e);
        res[1] = al.lastIndexOf(e);
        return res;
    }

    public static<T> T q8(LinkedList<T> al) {
        return al.poll();
    }

    public static<T,E> void q9(HashMap<T,E> hashList){
        for(Map.Entry entry:hashList.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }

    public static<T> ArrayList<T> q10(Set<T> set){
        return new ArrayList<>(set);
    }

    public static<T> void q11(Set<T> s1,Set<T> s2){
        s1.retainAll(s2);
        s2.retainAll(s1);
    }

    public static<T,E> void q12(Map<T,E> m1,Map<T,E> m2){
        m2.putAll(m1);
    }

    public static<T,E> boolean q13(Map<T,E> m, T key){
        return m.containsKey(key);
    }

    public static<T,E> Set<T> q14(Map<T,E> m){
        return m.keySet();
    }

    public static <T extends Comparable,E> List<T> q15(Map<T,E> m){
        List<T> keys = new ArrayList<>(m.keySet());
        keys.sort(Collections.reverseOrder());
        return keys;
    }

}
