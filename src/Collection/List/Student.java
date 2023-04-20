package Collection.List;


import java.util.*;

public class Student {
    String name;
    Integer hindi, maths, english, science;


    public Student(String name, Integer hindi, Integer maths, Integer english, Integer science) {
        this.name = name;
        this.hindi = hindi;
        this.maths = maths;
        this.english = english;
        this.science = science;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHindi() {
        return hindi;
    }

    public void setHindi(Integer hindi) {
        this.hindi = hindi;
    }

    public Integer getMaths() {
        return maths;
    }

    public void setMaths(Integer maths) {
        this.maths = maths;
    }

    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    public Integer getScience() {
        return science;
    }

    public void setScience(Integer science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return
                "name='" + name  +
                ", hindi=" + hindi +
                ", maths=" + maths +
                ", english=" + english +
                ", science=" + science
                ;
    }
}
    class runner {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name & marks of the student");
            Student s1 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Enter the name & marks of the student");
            Student s2 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Enter the name & marks of the student");
            Student s3 = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

            List<Student> Studentlist = new ArrayList<>();
            Studentlist.add(s1);
            Studentlist.add(s2);
            Studentlist.add(s3);


            Collections.sort(Studentlist, new SortbyMathAsc());
            System.out.println(Studentlist);




        }

    }

    class SortbyMathAsc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getMaths().compareTo(o2.getMaths());
        }

    }

    class SortbyMathDes implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getMaths().compareTo(o2.getMaths());
        }
    }


