public class Person {
    private String firstName, lastName, gender;
    public Person(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public String toString(){
        return firstName + " " + lastName + " " + gender;
    }
    public String getter_firstName(){
        return firstName;
    }
    public String getter_lastName(){
        return lastName;
    }
    public String getter_gender(){
        return gender;
    }
    public void setter_firstName(String firstName){
        this.firstName = firstName;
    }
    public void setter_lastName(String lastName){
        this.lastName = lastName;
    }
    public void setter_gender(String gender){
        this.gender = gender;
    }
    public boolean equals(Person P){
        return (P.firstName.equals(this.firstName) && P.lastName.equals(this.lastName) && P.gender.equals(this.gender));
    }
}

class Teacher extends Person{
    private String department, courses;
    public Teacher(String firstName, String lastName, String gender, String department, String courses){
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    public String getter_department(){
        return this.department;
    }
    public String getter_courses(){
        return this.courses;
    }
    public void setter_department(String department){
        this.department = department;
    }
    public void setter_courses(String courses){
        this.courses = courses;
    }
    @Override
    public String toString(){
        return super.toString() + " " + this.department + " " + this.courses;
    }
    public boolean equals(Teacher T){
        return super.equals(T) && this.department.equals(department) && this.courses.equals(courses);
    }

}
