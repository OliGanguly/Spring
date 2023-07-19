package Main;

import com.example.beans.Person;
import com.example.beans.Student;
import com.example.beans.Teacher;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Name of the Person : "+ person.getName());
        System.out.println("Name of the Vehicle : "+ vehicle.getName());
        System.out.println(person.getName() + " using vechile of : "+ person.getVehicle());

        Student s= context.getBean(Student.class);
        Teacher t = context.getBean(Teacher.class);
        System.out.println(s.getName() +" Tought by : "+s.getTeacher());
    }
}
