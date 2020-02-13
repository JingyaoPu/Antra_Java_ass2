package Collection;

import java.util.*;

public class Main {

    public static void main(String arg[]){
        //1.Write a Java program to update specific array element by given element.
        Character[] arr = new Character[]{'1','2','3','4','5'};
        Colletion_Practice.q1(arr,'3','6');
        System.out.println("q1: "+Arrays.toString(arr)); //[1, 2, 6, 4, 5]

        //2.Write a Java program to reverse elements in a array list.
        ArrayList<Character> arr2 = new ArrayList<Character>(Arrays.asList(arr));//[1, 2, 6, 4, 5]
        Colletion_Practice.q2(arr2);
        System.out.println("q2: "+arr2); //[5, 4, 6, 2, 1]

        //3. Write a Java program to join two array lists.
        ArrayList<Character> arr3 = new ArrayList<Character>(Arrays.asList(arr));
        //[5, 4, 6, 2, 1] + [1, 2, 6, 4, 5]
        System.out.println("q3: "+Colletion_Practice.q3(arr2,arr3)); //[5, 4, 6, 2, 1, 1, 2, 6, 4, 5]

        //4. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        System.out.println("q4: ");
        Colletion_Practice.q4(arr3);//1, 2, 6, 4, 5

        //5. Write a Java program to append the specified element to the end of a linked list.
        LinkedList<Character> arr4 = new LinkedList<>(arr3);//[1, 2, 6, 4, 5]
        Colletion_Practice.q5(arr4,'p');
        System.out.println("q5: "+arr4);//[1, 2, 6, 4, 5, p]

        //6.  Write a Java program to insert the specified element at the end of a linked list.
        Colletion_Practice.q6(arr4,'p');//[1, 2, 6, 4, 5, p]
        System.out.println("q6: "+arr4);//[1, 2, 6, 4, 5, p, p]

        //7. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        int[] res = Colletion_Practice.q7(arr4,'p');//[1, 2, 6, 4, 5, p, p]
        System.out.println("q7: "+Arrays.toString(res)); //[5, 6]

        //8. Write a Java program to remove and return the first element of a linked list.
        System.out.println("q8: "+Colletion_Practice.q8(arr4).toString()+" "+arr4.toString());//1 [2, 6, 4, 5, p, p]

        //9. Write a Java program to iterate through all elements in a hash list.
        HashMap<String,String> map = new HashMap<>();
        map.put("pu","jing");
        map.put("jing","yao");
        System.out.println("q9: ");
        Colletion_Practice.q9(map);//pu:jing ; jing:yao

        //10. Write a Java program to convert a hash set to an array.
        Set<String> set = new HashSet<>();
        set.addAll(Set.of("pu","jing","yao"));
        System.out.println("q10: "+Colletion_Practice.q10(set));//[pu, yao, jing]

        //11. Write a Java program to compare two sets and retain elements which are same on both sets.
        String pu = "pu",jing = "jing",yao = "yao",yu = "yu",xin = "xin";
        Set<String> set1 = new HashSet<>(Set.of(pu,jing,yao));
        Set<String> set2 = new HashSet<>(Set.of(pu,yu,xin));
        Colletion_Practice.q11(set1,set2);
        System.out.println("q11: "+set1+set2);//[pu][pu]

        //12. Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<String,String> newMap = new HashMap<>();
        Colletion_Practice.q12(map,newMap);
        System.out.println("q12: "+newMap);//{pu=jing, jing=yao}

        //13. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("q13: "+Colletion_Practice.q13(newMap,pu));//true
        System.out.println("q13: "+Colletion_Practice.q13(newMap,yu));//false

        //14. Write a Java program to get a set view of the keys contained in this map.
        System.out.println("q14: "+Colletion_Practice.q14(newMap));//[pu, jing]

        //15. Write a Java program to get a reverse order view of the keys contained in a given map.
        HashMap<String,String> reverseMap = new HashMap<>();
        reverseMap.put("1","1");
        reverseMap.put("2","2");
        reverseMap.put("3","3");
        System.out.println("q15: "+Colletion_Practice.q15(reverseMap));//[3, 2, 1]
    }
}
