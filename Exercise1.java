/* Consider the following sets
𝐴={𝑥 ∈ℤ:𝑥 𝑖𝑠 𝑎𝑛 𝑖𝑛𝑡𝑒𝑔𝑒𝑟 𝑚𝑢𝑙𝑡𝑖𝑝𝑙𝑒 𝑜𝑓 5 𝑎𝑛𝑑 𝑥 ≤150}
𝐵={𝑥 ∈ℤ:𝑥 𝑖𝑠 𝑎 𝑝𝑒𝑟𝑓𝑒𝑐𝑡 𝑠𝑞𝑢𝑎𝑟𝑒 𝑎𝑛𝑑 𝑥 ≤100} 
𝐶={𝑥 ∈ℤ:𝑥 𝑖𝑠 𝑎𝑛 𝑖𝑛𝑡𝑒𝑔𝑒𝑟 𝑚𝑢𝑙𝑡𝑖𝑝𝑙𝑒 𝑜𝑓 3 𝑎𝑛𝑑 𝑥 ≤100}

1. Find the content of sets A, B and C
2. Find the following sets 𝐴 ⋃𝐵, 𝐴⋂𝐶, 𝐵−𝐴, 𝐵⋃𝐶, 𝐴−𝐵

*/
/**
 * Exercise1
 */
import java.util.TreeSet;
import java.util.Set;

public class Exercise1 {

    public static void main(String[] args) {
        // define sets A, B, C
        Set<Integer> A = new TreeSet<>();
        Set<Integer> B = new TreeSet<>();
        Set<Integer> C = new TreeSet<>();

        // Set A
        for (int i = 0; i<= 150; i += 5){
            A.add(i);
        }

        //Set B
        int[] bValues = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
            for (int b : bValues) {
                B.add(b);
            }
        
        //Set C
        int[] cValues = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99};
        for (int c : cValues) {
            C.add(c);
        }

        //Set Operations

        // 𝐴 ⋃ 𝐵
        Set<Integer> A_union_B = new TreeSet<>(A);
        A_union_B.addAll(B);
        
        //𝐴⋂𝐶
        Set<Integer> A_intersect_C = new TreeSet <>(A);
        A_intersect_C.retainAll(C);

        //𝐵−𝐴
        Set<Integer> B_minus_A = new TreeSet<>(B);
        B_minus_A.removeAll(A);

        //𝐵⋃𝐶
        Set<Integer> B_union_C = new TreeSet<>(B);
        B_union_C.addAll(C);


    }
}