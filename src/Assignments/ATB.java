package Assignments;

public class ATB {

    String name;
    String Course;
    int PhoneNumber;
    String Email;

    public ATB() {
    }

    public ATB(String name, String Course, int PhoneNumber, String Email) {
        this.name = name;
        this.Course = Course;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public String toString() {
        return
                "name='" + name + '\'' +
                        ", Course='" + Course + '\'' +
                        ", PhoneNumber=" + PhoneNumber +
                        ", Email='" + Email;

    }

    public static void main(String[] args) {
        ATB[] atb2x = {
                new ATB("Harsh", "Automation", 2147483647, "a@a.com"),
                new ATB("Promode", "Automation", 2147483647, "b@b.com"),
                new ATB("Kamlesh", "Automation", 2147483647, "c@c.com"),
        };

        //System.out.println(atb2x[0].toString());
        for (ATB atb : atb2x) {
            System.out.println(atb);
        }


    }
}
