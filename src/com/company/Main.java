package com.company;

import com.company.Exceptions.NegativeException;
import com.company.Exceptions.TriangleException;

import java.io.*;
import java.util.*;

public class Main {

    public static List<Integer> listUnique(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }

//        for (int i = 0; i < list.size(); i++){
//            for (int j = i + 1; j < list.size(); j++){
//                if (list.get(i).equals(list.get(j)) && !newList.contains(list.get(j))) {
//                    newList.add(list.get(i));
//                }
//            }
//        }
        return newList;
    }
//        Map<String,Integer> myMap = new HashMap<>();
//        myMap.put("First", 1);
//        myMap.put("Second", 2);
//        for (Map.Entry<String, Integer> m : myMap.entrySet()){
//            System.out.println(m.getKey() + ": " + m.getValue());
//        }

//        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("123", "4565", "8"));
//       // System.out.println(ArrayUtil.sortList(listStr, (x) -> x.length()));
//        ArrayList<String> strList = new ArrayList<>(Arrays.asList("food", "home", "city", "sun"));
//        System.out.println(ArrayUtil.sortList(strList, (x) -> x.toUpperCase()));


    public static void main(String[] args) {
        int[] nums = {-5, 4, 3, -10, 9, -8};
//        int count = 0;
//        for (int i : nums){
//            if (i >0){
//                count++;
//            }
//        }


        long count = Stream.of("sun", "saturday", "vika", "no", "winter", "java")
//                .filter(w -> w.length() > 3)
//                .count();
//                System.out.println(count);
//        System.out.println();
//
//                Stream.of(-5, 4, 3, -10, 9, -8)
//                .map(w -> w + 10)
//                .forEach(System.out::println);
//
//                Stream.of("Hello", "world", null)
//                        .filter(Objects::nonNull)
//                        .forEach(System.out::println);
//                List<User> users = new ArrayList<>();
//               users.add(new User(21, "Vika"));
//               users.add(new User(10, "Nina"));
//               users.add(new User(25, "Ivan"));
//
//                List<String> myStr = users.stream()
//                       .filter(x -> x.isAdult(x.getAge()))
//                        .map(x -> x.getName() + "!")
//                       .collect(Collectors.toList());
//
//                 System.out.println(myStr);
//                List<String> myStr = Arrays.asList("Hello", "world", "", null, "astra", "java", "", "good");
//                List<String> lengthOfStr = myStr.stream()
//                        .filter(Objects::nonNull)
//                        .map(String::toUpperCase)
//                        .collect(Collectors.toList());
//
//                    System.out.println(lengthOfStr);
//        Triangle triangle = null;
//        try {
//            triangle = new Triangle(-3, -5, -20);
//        } catch (TriangleException | NegativeException er) {
//            System.out.println(er);
//        }
//        System.out.println(triangle.squareOfTriangle());

// uyguy       Map<String,Integer> myMap = new HashMap<>();
//        File file = new File("src/com/company/test.txt");
//        File file2 = new File("src/com/company/writeTest.txt");
//
//        try (BufferedReader br = new BufferedReader(new FileReader(file));
//             BufferedWriter wr = new BufferedWriter(new FileWriter(file2))){
//            String line;
//            while ((line = br.readLine()) != null){
//                    wr.write(line);
//                    wr.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Account account = new Account();
//        Thread one = new Thread(account);
//        Thread two = new Thread(account);
//        one.setName("Fred");
//        two.setName("Lucy");
//        one.start();
//        two.start();
//    }
//    }


//    class MyThread implements Runnable {
//
//        @Override
//        public void run() {
//            System.out.println("Hello? I am: " + Thread.currentThread().getName());
//
//
//        }

        Object obj = new Object();
        T t = new T(obj);
        T t2 = new T(obj);
        t.start();
        t2.start();

    }
}

class T extends Thread {

     Object obj1;

    public T(Object obj) {
        this.obj1 = obj;
    }

    @Override
    public void run() {
        synchronized (obj1) {
            for (int i = 0; i < 15; i++) {
                System.out.println(getName());
                obj1.notify();
                try {
                    obj1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}