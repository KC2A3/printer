package model;

public class Printer {
    public void skill(){
        System.out.println("print");
    }
    public void skill(String args){
        System.out.println("This is Overload");//重载必须在参数列表里面进行修改，而重写则只能改变实现的东西，
        // 就像一个碗，他装着液体，而重写只能改变液体的成分，而重载可以选择把液体换成固体之类的东西
    }
}
