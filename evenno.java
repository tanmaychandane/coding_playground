// print all numbers from 97-133 and find all even numbers
class evenno {
public static void main(String args[]) {
int i,b;
for (i = 97; i <= 133; i++) {
b = i % 2;
if (b == 0) {
System.out.print("\n"+i);
}
}
}
}