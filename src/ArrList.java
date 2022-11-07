import java.util.ArrayList;

public class ArrList {

  public static void main(String[] args) {
    System.out.println("Hello, World!");

    // ListArray
    ArrayList<String> myArr = new ArrayList<>();

    myArr.add("kitty");
    myArr.add("kitty");
    myArr.add("kitty");

    // System.out.println(myArr.remove(1));
    // System.out.println(myArr);

    print(myArr);
    System.out.println(myArr.size());

    ArrayList<Integer> my2ndArr = new ArrayList<>();
  }

  public static void print(ArrayList<String> list) {
    // list = new ArrayList<>();
    for (String str : list) System.out.println(str);
    // for (int i = 0; i < list.size(); i++) System.out.println(list[i]);
  }
}
