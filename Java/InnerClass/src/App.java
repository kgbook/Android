public class App {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(); // compile-time error
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.x + innerClass.y);
        System.out.println(innerClass.sum());

//        OuterClass.InnerClass2 innerClass2 = outerClass.new InnerClass2(); // compile-time error
//        System.out.println(outerClass.x + innerClass.z);

//        OuterClass.InnerClass3 innerClass3 = outerClass.new InnerClass3(); // compile-time error
        OuterClass.InnerClass3 innerClass3 = new OuterClass.InnerClass3();
        System.out.println(innerClass3.w);

        OuterClass.InnerClass4 innerClass4 = outerClass.new InnerClass4();
        System.out.println(innerClass4.myInnerMethod());
    }
}
