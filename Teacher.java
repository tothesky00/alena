public class Teacher extends People {

    public Teacher(String name,String lastname, int age){

        super(name, lastname, age);

    }

    @Override

    public void voice() {

        System.out.println("class Teacher345");

    }

    public void teach(){

        System.out.println("class Teacher");

    }

}