class Student {
    int rollNo;
    String name;
    int marks;
}

public class ArrayLearn {
    public static void main(String[] args) {
        // Static Array with Values
        int arr[] = { 7, 2, 3, 4 };

        // Arrays without values with size 4
        int arr2[] = new int[4];

        arr2[0] = 5;
        arr2[1] = 4;
        arr2[2] = 8;
        arr2[3] = 2;

        // ? Run a loop to print array values
        // for (int i = 0; i < arr2.length; ++i) {
        // System.out.println(arr2[i]);
        // }

        // ! 2D Array
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // ? Print values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--Print using Inhanced For loop--");

        // ? Inhanced For loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // ! Jagged Array
        // Direct initialization
        int[][] jaggedArray = {
                { 1, 2 }, // Row 0
                { 3, 4, 5 }, // Row 1
                { 6 } // Row 2
        };
        for (int n[] : jaggedArray) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Create dynamic array with size
        int jagged[][] = new int[3][]; // 3 rows, column size unspecified

        // Step 2: Initialize each row with different lengths
        jagged[0] = new int[2]; // Row 0 has 2 columns
        jagged[1] = new int[3]; // Row 1 has 3 columns
        jagged[2] = new int[1]; // Row 2 has 1 column

        // ? Array of Objects
        Student s1 = new Student();
        s1.rollNo = 19101;
        s1.name = "Ashutosh";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollNo = 19102;
        s2.name = "Anand";
        s2.marks = 72;

        Student s3 = new Student();
        s3.rollNo = 19103;
        s3.name = "Niket";
        s3.marks = 81;

        Student[] students = new Student[4];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("Roll No: " +
                        students[i].rollNo + ", Name: " + students[i].name + ", Marks: " + students[i].marks);
            }
        }

        System.out.println("\n##### For Each Loop #####\n");

        for (Student student : students) {
            if (student != null) {
                System.out.println("Roll No: " +
                        student.rollNo + ", Name: " + student.name + ", Marks: " + student.marks);
            }
        }
    }
}
