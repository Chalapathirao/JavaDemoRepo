package com.chalapathi.test3;

class CloneExample1 implements Cloneable {
    int id;
    String name;

    CloneExample1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample1 obj1 = new CloneExample1(1, "chalapathi");
        System.out.println(obj1.id+" "+ obj1.name);
        CloneExample1 copyObj = (CloneExample1) obj1.clone();
        System.out.println(copyObj.id+" "+ copyObj.name);

        //System.out.println(obj1 == copyObj);
        copyObj.name = "vicky";
        System.out.println(obj1.id+" "+ obj1.name);
        System.out.println(copyObj.id+" "+ copyObj.name);
    }
}