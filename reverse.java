class reverse {
public static void main(String args[]) {
int n=527,m,r=0;
while (n>0) {
m = n%10;
r = r * 10 + m;
n = n/10;
}
System.out.println("reverse No. is:	"+r);
}
}
