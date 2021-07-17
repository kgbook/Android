class OuterClass {
    int x = 1;

    class InnerClass {
        InnerClass2 innerClass2 = new InnerClass2();
        int y = 5;

        int sum() {
            return y + innerClass2.z;
        }
    }

    private class InnerClass2 {
        int z = 20;
    }

    static class InnerClass3 {
        int w = 30;
    }

    class InnerClass4 {
        public int myInnerMethod() {
            return x;
        }
    }
}
