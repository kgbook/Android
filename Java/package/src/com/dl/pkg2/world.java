package com.dl.pkg2;

public class world {
    public void printPackageClassName() {
        System.out.println(this.getClass().getSimpleName() + " of " + this.getClass().getPackageName());
    }
}
