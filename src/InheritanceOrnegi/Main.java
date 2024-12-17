package InheritanceOrnegi;

public class Main {
    public static void main(String[] args) {
        //https://github.com/rabiairemozer/JavaCampDay3/tree/main/JavaKampDay3HW
        //Kursa Kullanıcı-Öğrenci Ekleme-Silme Kod Örneği:
        UserManager userManager=new UserManager();
        Student student = new Student (1," Yaren Alaca","yareanalaca@gmail.com","123456",11,"Python");
        Instructor instructor=new Instructor (2," Engin Demiroğ","engindemirog@gmail.com","147852",27,"Python");
        User [] users = {instructor,student};
        userManager.addMultiple(users);
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addCourses(instructor);
        StudentManager studentManager=new StudentManager();
        studentManager.complete(student);
        User [] users2 = {instructor,student};
        userManager.deleteMultiple(users2);
    }
}
