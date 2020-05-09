public class People {

    protected int age;

    protected String name;

    protected String lastname;

    public People(String name, String lastname, int age){

        this.name=name;

        this.lastname=lastname;

        this.age=age;

    }

    public People(){

    }

    public void walk(){

        System.out.println("class People");

    }

    public void run(){

        System.out.println("class People2");

    }

    public void voice(){

        System.out.println("class People3");

    }

}