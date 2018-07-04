class sumofdigit {
public static void main(String args[]) {
int n = 123, m, sum = 0;
while (n>0) {
m = n % 10;
sum = sum + m;
n = n / 10;
}
System.out.println("Sum is:\t"+sum);
}
}