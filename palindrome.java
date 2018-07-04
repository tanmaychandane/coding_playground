class palindrome {
public static void main(String args[]) {
int n=727,m,r=0,a;
a=n;
while (n > 0) {
m = n % 10;
r = r * 10 + m;
n = n / 10;
}
if (a == r) {
System.out.println("Palindrome");
}
else {
System.out.println("Not palindrome");
}
}
}
