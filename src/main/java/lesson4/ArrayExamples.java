package lesson4;

import java.util.*;

public class ArrayExamples {
    public void stringsArray(){
        String[] buttons = {"Ok", "Cancel", "Login", "SignUp"};
        //buttons[2] ="Exit";

        int length = buttons.length;
//        System.out.println(buttons[2]);
//        System.out.println("length  " + length);
//
//        for (int i=0; i< buttons.length; i++) {
//            System.out.println(buttons[i]);
//        }

        for (String button: buttons){
            System.out.println((button));
        }
    }

    public void stringsArrayWithSize(){
        String[] array = new String[5];
        array[0] = "OK";
        array[1] = "CANCEL";
        array[2] = "LOGIN";
        array[3] = "SIGNUP";
        System.out.println("length  " + array.length);
    }

    public void integerArray(){
        int[] ids = {12,3,8,10};
        System.out.println(ids[2]);
    }

    public void arrayListExamples(){
        ArrayList<String> buttons = new ArrayList<String>();
        buttons.add ("ok");
        buttons.add ("cancel");
        buttons.add ("login");
        buttons.add ("exit");

        for (int i=0; i< buttons.size();i++){
            System.out.println(buttons.get(i));
        }
        for (String button: buttons){
            System.out.println((button));
        }
        System.out.println("The size of the list "+ buttons.size());
        buttons.add ("signup");
        for (String button: buttons){
            System.out.println((button));
        }
        buttons.remove("exit");
        for (String button: buttons){
            System.out.println((button));
        }

        buttons.clear();
        System.out.println("The size of the list "+ buttons.size());
        }
    public void arrayListSortingExamples() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(123);
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(98);

        Collections.sort(arrayList);
        for (Integer i:arrayList){
            System.out.println(i);
        }
    }

    public void hashMapExample() {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Kate", "Moscow");
        hashMap.put("Moshe", "Tel-Aviv");
        hashMap.put("Sarah", "Jerusalem");

        System.out.println(hashMap);

        System.out.println(hashMap.get("Moshe"));

        hashMap.remove("John");

        System.out.println(hashMap.size());

    }

    public void hashSetExample() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Abi");
        hashSet.add("kate");
        hashSet.add("Moshe");

        System.out.println(hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);


    }

}

