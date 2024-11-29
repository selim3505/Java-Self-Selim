package methods;

public class cube {
    public int cubic(int n) {
        return 3*n;
    }

    public static void main(String[] args) {
       cube cube = new cube();
       System.out.println(cube.cubic(3));
    }
}
/*
Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9
 */