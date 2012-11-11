package Expo1;

import java.util.*;
public class Ex1{
    public static void main(String[] args){
        ArrayList tArrayList = new ArrayList();
        tArrayList.add("Hola,");
        tArrayList.add("como");
        tArrayList.add("te");
        tArrayList.add("encuentras");
        tArrayList.add("?");
        for (int i = 0; i < tArrayList.size(); i++)
            System.out.print(tArrayList.get(i) + " " ) ;
    }
}