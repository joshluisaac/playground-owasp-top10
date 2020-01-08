public class StringTest {

  public static void main(String[] args) {
    String a = "Joshua";
    String b = "Joshua";
    String c = "JoshuaX";
    System.out.println(a.equals(b));
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(c.hashCode());
  }
}
