public class Student extends People{

    public Student(String name,String lastname, int age){

        super(name, lastname, age);

    }

    @Override

    public void run() {

        System.out.println("class Student123");

    }

    public void learn(){

        System.out.println("class Student");

    }

}

