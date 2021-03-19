class ColorException extends Exception {}
class WhiteException extends ColorException {}
class practice {
  void m1() throws ColorException {throw new ColorException();}
  void m2() throws WhiteException {throw new WhiteException();}
  public static void main (String[] args) {
    practice white = new practice();
    int a,b,d,f; a = b = d = f = 0;
    try {white.m1(); a++;} catch (WhiteException e) {b++;}
    try {white.m2(); d++;} catch (WhiteException e) {f++;}
    System.out.print(a+","+b+","+d+","+f);
}}

