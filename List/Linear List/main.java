package study.list;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        sqList L = new sqList(10);
        for (int i = 0; i < 8; i++) {
            int obj = i;
            L.insert(i,obj);
        }
        L.display();
        // System.out.println(L.isEmpty());
        //System.out.println(L.length());
        //System.out.println(L.get(2));
        //L.insert(2,999);
        //L.display();
        //L.remove(6);
        //L.display();
        System.out.println(L.index(5));
    }
}
