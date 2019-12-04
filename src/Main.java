public class Main {

    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Great! Passed!");
                break;
            case 'B':
                System.out.println("Very Good! Passed!");
                break;
            case 'C':
                System.out.println("Good! Passed!");
                break;
            case 'D':
                System.out.println("Not Bad! Passed!");
                break;
            case 'F':
                System.out.println("Unfortunately! Failed!");
                break;
            default:
                System.out.println("Invalid Grade!");
        }
    }
}
