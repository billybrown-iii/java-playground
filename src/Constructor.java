import java.util.ArrayList;
import java.util.List;

public class Constructor {

  public static void main(String[] args) {
    Person ada = new Person("Ada", 17);
    Person leo = new HyperPerson("Leo", 14);

    // System.out.println(ClassInPackage.ans);

    List<Person> myPeeps = new ArrayList<>();
    myPeeps.add(ada);
    myPeeps.add(leo);

    for (Person folk : myPeeps) {
      folk.speak();
      if (folk instanceof HyperPerson) {
        ((HyperPerson) folk).caffeinate();
      }
    }
  }
}

class Person {

  private int age;
  private String name;

  Person(String initialName, int initialAge) {
    // either works
    name = initialName;
    this.age = initialAge;
  }

  public void speak() {
    System.out.println(
      "My name is " +
      this.getName() +
      " and I am " +
      this.getAge() +
      " years old."
    );
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class HyperPerson extends Person {

  int mg = 0;

  HyperPerson(String initialName, int initialAge) {
    super(initialName, initialAge);
  }

  public void speak() {
    System.out.println(
      "MY NAME IS " +
      this.getName() +
      " AND I AM " +
      this.getAge() +
      " YEARS OLD."
    );
  }

  void caffeinate() {
    mg += 150;
    System.out.println("Caffeine level: " + mg);
  }
}
