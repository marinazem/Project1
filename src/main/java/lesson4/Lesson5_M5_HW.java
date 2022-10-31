package lesson4;

import java.util.*;

public class Lesson5_M5_HW {
    public static void main(String[] args) {
        Lesson5_M5_HW lesson5_m5_hw = new Lesson5_M5_HW();

        System.out.println (lesson5_m5_hw.arrayDay(2));

        System.out.println(lesson5_m5_hw.getToyById(5));

        lesson5_m5_hw.hashSetExample();
    }
    //        Assignment 1
        public String arrayDay (int day){
            ArrayList<String> daysOfTheWeek = new ArrayList<String>();
            daysOfTheWeek.add ("Sunday");
            daysOfTheWeek.add ("Monday");
            daysOfTheWeek.add ("Tuesday");
            daysOfTheWeek.add ("Wednesday");
            daysOfTheWeek.add ("Thursday");
            daysOfTheWeek.add ("Friday");
            daysOfTheWeek.add ("Saturday");

            for (int i=0; i< daysOfTheWeek.size();i++){
                System.out.println(daysOfTheWeek.get(i));
            }
            return daysOfTheWeek.get(day-1);
        }

    //        Assignment 2
    public String getToyById(int id){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty");
        hashMap.put(56, "Junior QA Analyst Doll");
        System.out.println(hashMap);
        if (hashMap.get(id)==null){
            System.out.println("No such Toy");
        }
            return hashMap.get(id);

    }
    //        Assignment 3
    public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Steve");
        hashSet.add("Tim");
        hashSet.add("Lucy");
        hashSet.add("Steve");
        hashSet.add("Pat");
        hashSet.add("Angela");
        hashSet.add("Tom");
        hashSet.add("Tim");
        hashSet.add("Anna");
        hashSet.add("Lucy");

        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }

}

