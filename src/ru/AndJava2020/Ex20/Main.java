package ru.AndJava2020.Ex20;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String [] s={"first","second"}; //массив строк
        Integer [] a={-1,0,1}; //массив int
        Collection f= new Collection();
        f.addArray(s);
        f.addArray(a);
        f.add(3.0); // double
        f.getList();
        System.out.println(f);
        System.out.println(f.get(3));
        System.out.println(f.get(10));
        System.out.println(Solution.createArrayList(s));
        System.out.println(Solution.createHashList(s));
        System.out.println(Solution.createHashMap(s,a));
        f.showList5();
    }
}
