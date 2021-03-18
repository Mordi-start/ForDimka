import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NullPointerException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> testList1 = Arrays.asList(8, 4, 6, 7, 7);
        MyIterator mi1 = new MyIterator(testList1);
        mi1.hasNext();
        mi1.hasNext();
        mi1.hasNext();
        System.out.print(mi1.next() + " ");
        System.out.print(mi1.next() + " ");
        System.out.print(mi1.next() + " ");
        System.out.print(mi1.next() + " ");
        while (mi1.hasNext()) {
            System.out.print(mi1.next() + " ");
        }
        System.out.print("\n=======================\n");


        MyIterator iterator = new MyIterator(list);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.print("\n===========================\n");
//
        iterator = new MyIterator(Arrays.asList(0, -1, 8));
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.print("\n===========================\n");
//
        iterator = new MyIterator(Arrays.asList(2, 3, 7, 7, 8));
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.print("\n===========================\n");
//
        iterator = new MyIterator(Arrays.asList(-2, -1, 3, 5, 3, -5, 98, -98, 2521, 3, 3, 7, 3));
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.print("\n===========================\n");
//
////        iterator = new MyIterator(Arrays.asList(null,null,null,null));
////        while(iterator.hasNext()) {
////            System.out.print(iterator.next() + " ");
////        }
////
////        System.out.print("\n===========================\n");
//
//        iterator = new MyIterator(Arrays.asList());
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//
//        System.out.print("\n===========================\n");
//
//        List<Integer> testList1 = Arrays.asList(3, 7, 7);
//
//        try {
//            MyIterator mi1 = new MyIterator(testList1);
//            System.out.print(mi1.next() + " ");
//            System.out.print(mi1.next() + " ");
//            while (mi1.hasNext()) {
//                System.out.print(mi1.next() + " ");
//            }
//            System.out.print("\n=======================\n");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
//
//
//
        List<Integer> testList2 = Arrays.asList(3, 4, 0, 7, 7);
        MyIterator mi2 = new MyIterator(testList2);

        System.out.print(mi2.next() + " ");
        System.out.print(mi2.next() + " ");
        while (mi2.hasNext()) {
            System.out.print(mi2.next() + " ");
        }
        System.out.print("\n=======================\n");
    }


}