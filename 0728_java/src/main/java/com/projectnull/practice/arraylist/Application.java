package com.projectnull.practice.arraylist;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ArrayList alist1 = new ArrayList();

        alist1.add("최우식");
        alist1.add(35);
        alist1.add(3.26);
        alist1.add("캐나다");

        System.out.println(alist1);

        System.out.println(alist1.size());

        for (int i =0; i <alist1.size(); i++) {

            System.out.println(alist1.get(i));
        }

        alist1.add(1,"나이는 ");
        System.out.println(alist1);

        alist1.add(3,"생일은");
        System.out.println(alist1);

        alist1.add(5, "국적은 ");
        System.out.println(alist1);


        List<String> stringList = new ArrayList<>();
        stringList.add("나는");
        stringList.add("지금");
        stringList.add("졸려 죽겠다");
        stringList.add("ㅠㅠ");

        System.out.println(stringList);



        stringList = new LinkedList<>(stringList);

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();

        List<String> descList = new ArrayList<>();

        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }

        System.out.println(descList);

    }
}
