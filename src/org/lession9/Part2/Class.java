package org.lession9.Part2;
import java.util.*;

public class Class {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("Александр");
        strings.add("Алексей");
        strings.add("Дмитрий");
        strings.add("Егор");
        strings.add("Кирилл");
        strings.add("Кирилл");
        strings.add("Тарас");
        strings.add("Юрий");
        System.out.println(strings);

        System.out.println(noDuplicates(strings));
    }

    public static Set<String> noDuplicates(List<String> strings){
        Set<String> newSet = new HashSet<>();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            newSet.add(iterator.next());
        }

        return newSet;
    }
}
