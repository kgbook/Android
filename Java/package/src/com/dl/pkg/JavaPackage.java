package com.dl.pkg;

import com.dl.pkg2.world;

public class JavaPackage {
    void printPackageClassName() {
//        System.out.println(this.getClass().getCanonicalName());
        System.out.println(this.getClass().getSimpleName() + " of " + this.getClass().getPackageName());
    }

    public static void main(String[] args) {
        var hello = new Hello();
        hello.printPackageClassName();

        var world = new world();
        world.printPackageClassName();

        JavaPackage jpck = new JavaPackage();
        jpck.printPackageClassName();
    }
}
