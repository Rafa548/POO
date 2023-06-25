package Aula09.Ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionTester_1 {
    public static void main(String[] args) {
    int DIM = 5000;
    Collection<Integer> col = new ArrayList<>();
    Collection<Integer> l = new LinkedList<>();
    Set<Integer> h = new HashSet<>();
    Set<Integer> t = new TreeSet<>();
    checkPerformance_C(col, DIM);
    checkPerformance_H(h, DIM);
    checkPerformance_T(t, DIM);
    checkPerformance_L(l, DIM);
    }


    private static void checkPerformance_C(Collection<Integer> col, int DIM) {
    double start, stop, delta;
    // Add
    start = System.nanoTime(); // clock snapshot before
    for(int i=0; i<DIM; i++ )
        col.add( i );
        
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert to milliseconds
    System.out.println(col.size()+ ": Add to " +
        col.getClass().getSimpleName() +" took " + delta + "ms");
    // Search
    start = System.nanoTime(); // clock snapshot before
    for(int i=0; i<DIM; i++ ) {
        int n = (int) (Math.random()*DIM);
        if (!col.contains(n))
            System.out.println("Not found???"+n);
    }
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
    System.out.println(col.size()+ ": Search to " +
        col.getClass().getSimpleName() +" took " + delta + "ms");
    // Remove
    start = System.nanoTime(); // clock snapshot before
    Iterator<Integer> iterator = col.iterator();
    while (iterator.hasNext()) {
        iterator.next();
        iterator.remove();
    }
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
    System.out.println(col.size() + ": Remove from "+
        col.getClass().getSimpleName() +" took " + delta + "ms");
    }


    private static void checkPerformance_H(Set<Integer> h, int DIM) {
    double start, stop, delta;
    // Add
    start = System.nanoTime(); // clock snapshot before
    for(int i=0; i<DIM; i++ )
        h.add( i );
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert to milliseconds
    System.out.println(h.size()+ ": Add to " +
        h.getClass().getSimpleName() +" took " + delta + "ms");
    // Search
    start = System.nanoTime(); // clock snapshot before
    for(int i=0; i<DIM; i++ ) {
        int n = (int) (Math.random()*DIM);
        if (!h.contains(n))
            System.out.println("Not found???"+n);
    }
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
    System.out.println(h.size()+ ": Search to " +
        h.getClass().getSimpleName() +" took " + delta + "ms");
    // Remove
    start = System.nanoTime(); // clock snapshot before
    Iterator<Integer> iterator = h.iterator();
    while (iterator.hasNext()) {
        iterator.next();
        iterator.remove();
    }
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
    System.out.println(h.size() + ": Remove from "+
        h.getClass().getSimpleName() +" took " + delta + "ms");
    }


    private static void checkPerformance_T(Set<Integer> t, int DIM) {
    double start, stop, delta;
    // Add
    start = System.nanoTime(); // clock snapshot before
    for(int i=0; i<DIM; i++ )
        t.add( i );
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert to milliseconds
    System.out.println(t.size()+ ": Add to " +
        t.getClass().getSimpleName() +" took " + delta + "ms");
    // Search
    start = System.nanoTime(); // clock snapshot before
    for(int i=0; i<DIM; i++ ) {
        int n = (int) (Math.random()*DIM);
        if (!t.contains(n))
            System.out.println("Not found???"+n);
    }
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
    System.out.println(t.size()+ ": Search to " +
        t.getClass().getSimpleName() +" took " + delta + "ms");
    // Remove
    start = System.nanoTime(); // clock snapshot before
    Iterator<Integer> iterator = t.iterator();
    while (iterator.hasNext()) {
        iterator.next();
        iterator.remove();
    }
    stop = System.nanoTime(); // clock snapshot after
    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
    System.out.println(t.size() + ": Remove from "+
        t.getClass().getSimpleName() +" took " + delta + "ms");
    }
    

    private static void checkPerformance_L(Collection<Integer> l, int DIM) {
        double start, stop, delta;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            l.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        System.out.println(l.size()+ ": Add to " +
            l.getClass().getSimpleName() +" took " + delta + "ms");
        // Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!l.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        System.out.println(l.size()+ ": Search to " +
            l.getClass().getSimpleName() +" took " + delta + "ms");
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        System.out.println(l.size() + ": Remove from "+
            l.getClass().getSimpleName() +" took " + delta + "ms");
        }
}