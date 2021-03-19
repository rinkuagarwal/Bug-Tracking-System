package day7;

class A {}  class B extends A {}
class C extends B {
  static void m(A x, A y) {System.out.print("AA");}
  static void m(A x, B y) {System.out.print("AB");}
  static void m(B x, A y) {System.out.print("BA");}
  static void m(B x, B y) {System.out.print("BB");}
  public static void main(String[] args) {
    A a1; B b1; m(null,null); m(a1=null,b1=null); m(b1, a1);
}}