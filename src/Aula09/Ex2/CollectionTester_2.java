package Aula09.Ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionTester_2 {
    public static void main(String[] args) {
        int Dim_1, Dim_5, Dim_10, Dim_20, Dim_40, Dim_100;
        Dim_1 = 1000;
        Dim_5 = 5000;
        Dim_10 = 10000;
        Dim_20 = 20000;
        Dim_40 = 40000;
        Dim_100 = 100000;
        Collection<Integer> col = new ArrayList<>();
        Collection<Integer> l = new LinkedList<>();
        Set<Integer> h = new HashSet<>();
        Set<Integer> t = new TreeSet<>();
        System.out.println("Collection      1000     5000     10000     20000     40000     100000");
        System.out.println("Array List     ");
        System.out.printf("add             %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_C(col, Dim_1)[0],checkPerformance_C(col, Dim_5)[0],checkPerformance_C(col, Dim_10)[0],
                        checkPerformance_C(col, Dim_20)[0],checkPerformance_C(col, Dim_40)[0],checkPerformance_C(col, Dim_100)[0]);
        System.out.printf("search          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_C(col, Dim_1)[1],checkPerformance_C(col, Dim_5)[1],checkPerformance_C(col, Dim_10)[1],
                        checkPerformance_C(col, Dim_20)[1],checkPerformance_C(col, Dim_40)[1],checkPerformance_C(col, Dim_100)[1]);
        System.out.printf("remove          %.1f      %.1f      %.1f       %.1f      %.1f      %.1f%n",
                    checkPerformance_C(col, Dim_1)[2],checkPerformance_C(col, Dim_5)[2],checkPerformance_C(col, Dim_10)[2],
                        checkPerformance_C(col, Dim_20)[2],checkPerformance_C(col, Dim_40)[2],checkPerformance_C(col, Dim_100)[2]);
        System.out.println("Linked List     ");
        System.out.printf("add             %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_C(l, Dim_1)[0],checkPerformance_C(l, Dim_5)[0],checkPerformance_C(l, Dim_10)[0],
                        checkPerformance_C(l, Dim_20)[0],checkPerformance_C(l, Dim_40)[0],checkPerformance_C(l, Dim_100)[0]);
        System.out.printf("search          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_C(l, Dim_1)[1],checkPerformance_C(l, Dim_5)[1],checkPerformance_C(l, Dim_10)[1],
                        checkPerformance_C(l, Dim_20)[1],checkPerformance_C(l, Dim_40)[1],checkPerformance_C(l, Dim_100)[1]);
        System.out.printf("remove          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_C(l, Dim_1)[2],checkPerformance_C(l, Dim_5)[2],checkPerformance_C(l, Dim_10)[2],
                        checkPerformance_C(l, Dim_20)[2],checkPerformance_C(l, Dim_40)[2],checkPerformance_C(l, Dim_100)[2]);
        System.out.println("HashSet    ");
        System.out.printf("add             %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_S(h, Dim_1)[0],checkPerformance_S(h, Dim_5)[0],checkPerformance_S(h, Dim_10)[0],
                        checkPerformance_S(h, Dim_20)[0],checkPerformance_S(h, Dim_40)[0],checkPerformance_S(h, Dim_100)[0]);
        System.out.printf("search          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_S(h, Dim_1)[1],checkPerformance_S(h, Dim_5)[1],checkPerformance_C(h, Dim_10)[1],
                        checkPerformance_C(h, Dim_20)[1],checkPerformance_C(h, Dim_40)[1],checkPerformance_C(h, Dim_100)[1]);
        System.out.printf("remove          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_S(h, Dim_1)[2],checkPerformance_S(h, Dim_5)[2],checkPerformance_S(h, Dim_10)[2],
                        checkPerformance_S(h, Dim_20)[2],checkPerformance_S(h, Dim_40)[2],checkPerformance_S(h, Dim_100)[2]);
        System.out.println("TreeSet    ");
        System.out.printf("add             %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_S(t, Dim_1)[0],checkPerformance_S(t, Dim_5)[0],checkPerformance_S(t, Dim_10)[0],
                         checkPerformance_S(t, Dim_20)[0],checkPerformance_S(h, Dim_40)[0],checkPerformance_S(h, Dim_100)[0]);
        System.out.printf("search          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_S(t, Dim_1)[1],checkPerformance_S(t, Dim_5)[1],checkPerformance_C(t, Dim_10)[1],
                         checkPerformance_C(h, Dim_20)[1],checkPerformance_C(t, Dim_40)[1],checkPerformance_C(t, Dim_100)[1]);
        System.out.printf("remove          %.1f      %.1f      %.1f       %.1f       %.1f       %.1f%n",
                    checkPerformance_S(t, Dim_1)[2],checkPerformance_S(t, Dim_5)[2],checkPerformance_S(t, Dim_10)[2],
                          checkPerformance_S(t, Dim_20)[2],checkPerformance_S(t, Dim_40)[2],checkPerformance_S(t, Dim_100)[2]);
        }
    
    
        private static Double[] checkPerformance_C(Collection<Integer> col, int DIM) {
        double start, stop, delta, add, search, remove;
        Double[] result = new Double[3];
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
            
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        add = Math.round(delta*100.0)/100.0;
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            //int n = (int) (Math.random()*DIM);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        search = Math.round(delta*100.0)/100.0;
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        remove = Math.round(delta*100.0)/100.0;
        result[0] = add;
        result[1] = search;
        result[2] = remove;
        return result;
        }

        private static Double[] checkPerformance_S(Set<Integer> l, int DIM) {
            double start, stop, delta, add, search, remove;
            Double[] result = new Double[3];
            // Add
            start = System.nanoTime(); // clock snapshot before
            for(int i=0; i<DIM; i++ )
                l.add( i );
                
            stop = System.nanoTime(); // clock snapshot after
            delta = (stop-start)/1e6; // convert to milliseconds
            add = Math.round(delta*100.0)/100.0;
            // Search
            start = System.nanoTime(); // clock snapshot before
            for(int i=0; i<DIM; i++ ) {
                //int n = (int) (Math.random()*DIM);
            }
            stop = System.nanoTime(); // clock snapshot after
            delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
            search = Math.round(delta*100.0)/100.0;
            // Remove
            start = System.nanoTime(); // clock snapshot before
            Iterator<Integer> iterator = l.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            stop = System.nanoTime(); // clock snapshot after
            delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
            remove = Math.round(delta*100.0)/100.0;
            result[0] = add;
            result[1] = search;
            result[2] = remove;
            return result;
            }
}
