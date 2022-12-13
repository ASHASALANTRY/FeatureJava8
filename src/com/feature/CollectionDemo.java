package com.feature;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class ComparatorImplementation implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1.equals(o2))
            return 1;
        else
            return -1;
    }
}
class emp implements Comparable{
    String name;
    Integer empId;

    public emp(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public int compareTo(Object o) {
        emp e=(emp)o;
       if(this.empId == e.empId  ){
           return 0;
       } else if (this.empId>e.empId ) {
           return 1;
       }else {
        return -1;
       }
    }

   /* @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }*/
}
public class CollectionDemo {
    static void listImplementation(){
        ArrayList list1 =new ArrayList();
        list1.add("abc");

        list1.add("abc2");
        list1.add("abc3");
        list1.add("abc4");
        Collections.sort(list1);
        List list2 = new LinkedList();
        list2.addAll(list1);
        System.out.println(list2);
        list2.add(11);
        list2.add(22);

        System.out.println(list1);
        list1.add(1,"abc4");
        System.out.println(list1);
        list1.add("abc5");
        System.out.println(list2);
        list2.retainAll(list1);

        System.out.println(list2);
        Object [] o=list2.toArray();
        List lis= Arrays.asList(o);
        for (Object s: o) {
            if(s instanceof String) {
                String ss = (String) s;
                System.out.println(ss);
            }
        }
        ArrayList list3 = new ArrayList<>();
        list3.add(new emp("abc",2));
        list3.add(new emp("abc1",4));
        list3.add(new emp("abc2",7));
        list3.add(new emp("abc3",1));
        System.out.println("before sorting list 3" + list3);
        Collections.sort(list3, new ComparatorImplementation());
        System.out.println("sorted list 3" + list3);

    }
    static void mapImplementation(){
        ComparatorImplementation comp=new ComparatorImplementation();
        Map map1=new TreeMap(comp);
        map1.put(11,112);
        map1.put(33,114);
        map1.put(2,112);
        map1.put(77,115);
        System.out.println(map1);
        Set s =map1.entrySet();
        Set s1 =map1.keySet();
        System.out.println(s);
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        Map<String,Integer> map2=new HashMap();
        map2.put("one",1);
        map2.put("two",2);
        map2.put("three",3);
        map2.put("four",5);
        System.out.println(map2);
        Iterator itr=map2.entrySet().iterator();
        while (itr.hasNext()){

            System.out.println(((Map.Entry)itr.next()).getValue());

                   // map2.put("five", 6);



        }
        Map<String,Integer> map3=new HashMap();
        map3.put("one",1);
        map3.put("two",2);
        map3.put("three",3);
        map3.put(null,5);
        for(Map.Entry<String,Integer> abc:map3.entrySet()){
            System.out.println( abc.getKey());
            System.out.println(abc.getValue());
        }
       System.out.println(map3);
    }
    static void setImplementation(){
        Set<emp> s=new TreeSet<>();

        s.add(new emp("abc",2));
        s.add(new emp("xyz",3));
        s.add(new emp("qwa",1));
        s.add(new emp("ptr",5));
        Iterator<emp> i=s.iterator();
        while(i.hasNext()){
            emp e=i.next();
          //  System.out.println( e.compareTo(new emp("abc",2)));

            System.out.println(e.empId+"-"+e.name);
        }
        System.out.println(s);
        Set s1=new HashSet();
        s1.add(1);
        s1.add(1);s1.add(2);s1.add(5);s1.add(11);
        System.out.println(s1);

    }
    public  static void main(String args []){
       //listImplementation();
      mapImplementation();
      // setImplementation();
    }
}
