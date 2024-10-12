/*
QUESTION:
A group 12 students go one a hike, accompanied by two faculty members who are the group leaders. 
How many ways are there for the entire group (including students and leaders) to line up? 
*/

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

    public static void main(String[] args) {
        int numStudents = 12;
        int numFaculty = 2;

        // Calculate and print the total arrangements
        BigInteger possibilities = totalPeople(numStudents, numFaculty);
        System.out.println("The total number of ways for the group to line up is: " + possibilities);
    }

}

