class factorial {
public static void main(String args[]) {
int i, n = 5, fact=1;
for (i = 1; i <= n; i++) {
fact = fact * i;
}
System.out.println("Factorial is:\t"+ fact);
}
}