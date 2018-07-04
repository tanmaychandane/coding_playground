class fibbonaci {
public static void main(String args[]) {
int a = 0, b = 1, c, i;
System.out.print(a);
System.out.print(b);
for (i = 0; i < 5; i++) {
c = a + b;
System.out.print(c);
a = b;
b = c;
}
}
}