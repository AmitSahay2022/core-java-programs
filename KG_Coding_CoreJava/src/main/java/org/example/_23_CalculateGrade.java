package org.example;

public class _23_CalculateGrade {
    public static void main(String[] args) {
        Student student1=new Student(98,"Amit Ka Beta");
        Student student2=new Student(49,"Katrina");
        Student student3=new Student(65,"Sumit Ka Beta");
        Student student4=new Student(78,"Amit Ki Sexy Beti");
        Student student5=new Student(82,"Disha Patani");
        System.out.println("Grade For "+student1.getName()+" is: "+gradeCalculator(student1));
        System.out.println("Grade For "+student2.getName()+" is: "+gradeCalculator(student2));
        System.out.println("Grade For "+student3.getName()+" is: "+gradeCalculator(student3));
        System.out.println("Grade For "+student4.getName()+" is: "+gradeCalculator(student4));
        System.out.println("Grade For "+student5.getName()+" is: "+gradeCalculator(student5));
    }
    public static char gradeCalculator(Student student){
        if(student.getMarks()>90) return 'A';
        else if (student.getMarks()>75) return 'B';
        else if (student.getMarks()>60) return 'C';
        else if(student.getMarks()>50) return 'D';
        else return 'F';
    }
    private static class Student{
        private int marks;
        private String name;

        public Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public String getName() {
            return name;
        }
    }
}
