package lesson4examples;

import java.util.*;

public class ArrayExamples {

    public void stringsArray() {
        String[] buttons = {"OK", "Cancel", "Login", "SignUp"};

        //buttons[4] = "Exit";

        int length = buttons.length;
//
//        System.out.println(buttons[2]);
//        System.out.println("length: " + length);

//        for(int i=0; i<buttons.length;i++){
//            System.out.println(buttons[i]);
//        }

        for (String button : buttons) {
            System.out.println(button);
        }
    }

    public void stringsArrayWithSize() {

        String[] array = new String[7];
        array[0] = "OK";
        array[1] = "Cancel";
        array[2] = "Login";
        array[3] = "SignUp";
        array[4] = "Exit";

        System.out.println("length: " + array.length);

    }

    public void integerArray() {
        int[] ids = {12, 3, 5, 8};
        System.out.println(ids[2]);

    }

    public void arrayListExample() {

        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Login");
        buttons.add("Exit");

        for (int i = 0; i < buttons.size(); i++) {
            System.out.println(buttons.get(i));
        }


        for (String button : buttons) {
            System.out.println(button);
        }

        System.out.println("The size of the list: " + buttons.size());

        buttons.add("Signup");

        for (String button : buttons) {
            System.out.println(button);
        }

        buttons.remove("Exit");
        System.out.println();

        for (String button : buttons) {
            System.out.println(button);
        }

        buttons.clear();

        System.out.println(buttons.size());

    }

    public void arrayListSortingExample() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(98);

        Collections.sort(arrayList);

        for (Integer i : arrayList) {
            System.out.println(i);
        }

    }

    public void hashMapExample() {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Moscow");
        hashMap.put("Moshe", "Tel-Aviv");
        hashMap.put("Moshe", "Jerusalem");

        System.out.println(hashMap);

        System.out.println(hashMap.get("Moshe"));

        hashMap.remove("John");

        System.out.println(hashMap.size());

    }

    public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");

        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);
    }


    // Java Program to remove repeated elements from ArrayList in Java.

    public void removeDuplicates() {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(56);
        arrayList.add(546);
        arrayList.add(546);
        arrayList.add(56);
        arrayList.add(2);

        Collections.sort(arrayList);
       System.out.println(arrayList);

        for (int i = 0; i < arrayList.size()-1; i++) {
            if (arrayList.get(i) != arrayList.get(i + 1)) {
                result.add(arrayList.get(i));
            }
        }
        System.out.println(result);


        HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);
        hashSet.addAll(arrayList);

        System.out.println(hashSet);
    }


}