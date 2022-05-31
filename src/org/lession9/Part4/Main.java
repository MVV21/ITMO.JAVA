package org.lession9.Part4;
import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        User user1 = new User("Александр");
        User user2 = new User("Алексей");
        User user3 = new User("Валентин");
        User user4 = new User("Кристина");
        User user5 = new User("Демьян");

        Map<User, Integer> map = new HashMap<>();
        map.put(user1, (int)(Math.random()*1000000));
        map.put(user2, (int)(Math.random()*1000000));
        map.put(user3, (int)(Math.random()*1000000));
        map.put(user4, (int)(Math.random()*1000000));
        map.put(user5, (int)(Math.random()*1000000));

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scan.next();

        Set<User> keys = map.keySet();
        int count = 0;
        for(User checkUser : keys){
            if (checkUser.getName().equals(name)){
                System.out.println("Количество очков пользователя " + checkUser.getName() + " составляет: " + map.get(checkUser));
            count++;
            }
        }
        if(count == 0) {
            System.out.println("Пользователь с именем " + name + " не зарегистрирован");
        }
    }
}
