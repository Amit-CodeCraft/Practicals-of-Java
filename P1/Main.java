
class Main {
    int rollNumber;
    String name;
    double marks1, marks2, marks3;

    Main(int rollNumber, String name, double marks1,
         double marks2, double marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Main s1 = new Main(101, "Aman", 85, 90, 80);
        Main s2 = new Main(102, "Priya", 92, 88, 95);
        Main s3 = new Main(103, "Rahul", 75, 82, 78);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
