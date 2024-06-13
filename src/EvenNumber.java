public class EvenNumber {
        public static void main(String[] args) {
            int number = 2; // Start with the first even number

            // Repeat until the number reaches a certain limit (e.g., 20)
            do {
                System.out.println("Even number: " + number);
                number += 2; // Increment by 2 to get the next even number
            } while (number <= 20); // Change the limit as needed
        }
}
