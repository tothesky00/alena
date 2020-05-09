public class Main {

    public static void main(String[] args){

        People people=new People();

        people.walk();

        Student student= new Student("Nana", "YYY", 25);

        student.learn();

        student.run();

        System.out.println(student.name +" "+ student.lastname +" "+ student.age);

        Teacher teacher= new Teacher("RARA", "DDD", 32);

        teacher.teach();

        teacher.voice();

        System.out.println(teacher.name+" "+teacher.lastname+""+teacher.age);

    }

}