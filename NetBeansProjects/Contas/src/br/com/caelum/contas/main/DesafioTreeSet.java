package br.com.caelum.contas.main;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class DesafioTreeSet {

    public static void main(String[] args) {

        Collection<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer obj1, Integer obj2) {
                if (obj1 < obj2) {
                    return +1;
                } else if (obj1 > obj2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 1; i <= 1000; i++) {
            set.add(new Integer(i));
        }

        Iterator<Integer> interador = set.iterator();

        while (interador.hasNext()) {
            System.out.println(interador.next());
        }

    }
}
