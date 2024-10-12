import java.math.BigInteger;
public class FactorialFunction {
    
    public static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE; //Initializes variable names result to the value of 1
        for (int i = 2; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method to calculate total arrangements
    public static BigInteger totalPeople(int numStudents, int numFaculty) {
        int totalIndividuals = numStudents + numFaculty;
        return factorial(totalIndividuals);
    }


}
