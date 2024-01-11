package components.java_classes.inner_class;

class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 10;
  }
}

public class PrivateInnerClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
