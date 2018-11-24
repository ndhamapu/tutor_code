package ct.primer.collection;

import java.util.*;
public class UnionIntersectionList
{
    public static void main(String args[]){
    List<String> list1 = new LinkedList<String>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new LinkedList<String>(Arrays.asList("B", "C", "D", "E", "F"));

        System.out.println(new UnionIntersectionList().intersection(list1, list2));
        System.out.println(new UnionIntersectionList().union(list1, list2));
    }

    public <T> List<T> union(List<T> list1, List<T> list2) {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new LinkedList<T>(set);
    }

    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> list = new LinkedList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }
}
