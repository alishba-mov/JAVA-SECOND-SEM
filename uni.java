//25cs006

import java.util.Scanner;

class Unviersity{
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter University Name: ");
        String uniName = sc.nextLine();

        System.out.print("Enter Department Name: ");
        String depName = sc.nextLine();

        System.out.print("Enter Total Number of Students: ");
        int totalStudents = sc.nextInt();

        System.out.println("\n-- Student Roll Numbers --");
        for (int i = 1; i <= totalStudents; i++) {
            System.out.println("Roll No: " + i);
        }

        sc.close();
    }
}

