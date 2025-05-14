//refrence variable
class Car{
    String model;
    public Car(String model)
    {
      this.model=model;
    }
    void display()
    {
        System.out.println(model);
    }
}
    



public class RefString {
    public static void main(String[] args) {
        Car C1=new Car("BMW");
        Car C2=new Car("kwid");
        C2.display();
        C2=C1;

    }

}

