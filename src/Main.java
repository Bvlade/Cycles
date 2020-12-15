public class Main {
    public static void main(String[] args) {

//        for (int age = 15; age < 40; age++) {

        int age = 15;
        while (age < 40) {

            System.out.print(age + " лет; вы можете: ");
            if (age >= 16 && age < 18) {
                System.out.print("иметь ученические права");
            } else if (age >= 18) {
                System.out.print("иметь обычные права");
            } else {
                System.out.print("вы можете жить обычной жизнью");
            }

            if (age >= 35) {
                System.out.print(", вы можете баллотироватся в президенты");
            }

            System.out.println();
            age++;
        }
    }
}