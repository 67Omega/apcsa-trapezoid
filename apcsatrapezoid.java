import java.util.Scanner;

public class apcsatrapezoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	System.out.println("Enter a top length: ");
	double trapezoidTop = in.nextDouble();
	System.out.println("Enter a bottom length: ");
	double trapezoidBottom = in.nextDouble();
	System.out.println("Enter a height: ");
	double trapezoidHeight = in.nextDouble();
	double trapezoidArea = (((trapezoidTop + trapezoidBottom) / 2) * trapezoidHeight);
	System.out.printf("The area of the trapezoid is %.1f." , trapezoidArea);
        in.close();
    }
}