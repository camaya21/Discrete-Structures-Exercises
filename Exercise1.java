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
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {

    public static void main(String[] args) {
        // define sets A, B, C
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        // Set A
        for (int i = 0; i<= 150; i += 5){
            A.add(i);
        }

        //Set B
        int[] bValues = {0,1,4,9,16,25,36,49,64,81,100};
            for (int b : bValues) {
                B.add(b);
            }
            System.out.print(B);
    }
}