package com.dl.pkg;

public class Hello {
    void printPackageClassName() {
//        System.out.println(this.getClass().getCanonicalName());
        System.out.println(this.getClass().getSimpleName() + " of " + this.getClass().getPackageName());
    }
}
