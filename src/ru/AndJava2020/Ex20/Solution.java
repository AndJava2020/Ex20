package ru.AndJava2020.Ex20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution  {
    public static <T> ArrayList createArrayList(T [] s){
        ArrayList<T> array= new ArrayList<>();
        for (T t:s
        ) {
            array.add(t);
        }
        return array;
    }
    public static <T> HashSet createHashList(T [] s){
        HashSet<T> array= new HashSet<>();
        for (T t:s
        ) {
            array.add(t);
        }
        return array;
    }
    public static <T,K> HashMap<T,K> createHashMap(T [] s, K[] keys){
        HashMap<T,K> array= new HashMap<>();
        for (int i = 0; i <s.length ; i++) {
            array.put(s[i],keys[i]);
        }
        return array;
    }
}
