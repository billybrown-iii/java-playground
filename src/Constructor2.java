public class Constructor2 {

  public static void main(String[] args) {
    Person2 mia = new Person2("Mia");
    System.out.println(mia.getName());
  }
}

class Person2 {

  private String name;
  private int age;

  public Person2(String initialName) {
    this.age = 0;
    this.name = initialName;
  }

  public String getName() {
    return this.name;
  }
}
