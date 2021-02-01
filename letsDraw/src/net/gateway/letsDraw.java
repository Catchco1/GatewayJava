package net.gateway;


public class letsDraw {

    public static void main(String[] args) {
	// write your code here
        StdDraw.downTriangle(0.5, 0.5, 0.3, 0.2);
        StdDraw.filledDownTriangle(0.5, 0.5, 0.15, 0.1);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(0.5, 0.65, "TRIANGLE");
    }
}
