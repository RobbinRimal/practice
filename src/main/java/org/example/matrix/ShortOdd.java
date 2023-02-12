package org.example.matrix;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ShortOdd {
    public static int[] sortArray(int[] array) {
        Map<Integer,Integer> arraymap=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            arraymap.put(i,array[i]);

        }
        for (Integer k:arraymap.keySet()){
            for (Integer v: arraymap.keySet()){
                if((arraymap.get(k)%2!=0)&&(arraymap.get(v)%2!=0)){
                    if(arraymap.get(k)<arraymap.get(v)){
                        int greater =arraymap.get(k);
                        int smaller=arraymap.get(v);
                        arraymap.put(k,smaller);
                        arraymap.put(v,greater);
                    }
                }
            }
        }
        List<Integer> list =arraymap.keySet().stream().map(x -> arraymap.get(x)).collect(Collectors.toList());

        return         list.stream().mapToInt(x->x).toArray();
}
/*Write function RemoveExclamationMarks which removes all exclamation marks from a given string.*/
    static String removeExclamationMarks(String s) {

        return s.replace("!","");
    }

}
