package com.pgs.javadev;

import java.util.Scanner;

public class App {
    public static void main( String[] args) {
        Scanner	read = new Scanner(System.in);
        XmasTreeCreator creator = new XmasTreeCreator();

	System.out.println("Z ilu poziomów ma być zbudowana choinka ?");
	int nOfLevels = read.nextInt();

	System.out.println("Z jakich znaków ?");
	String character = read.next();
        
        System.out.println("Od której strony ma być rysowana choinka ? (wprowadź odpowiedni numer)");
        System.out.println("1. Od góry");
	System.out.println("2. Od dołu");
        System.out.println("3. Od lewej");
        System.out.println("4. Od prawej\n");
        int direction = read.nextInt();
	System.out.println();
		
	System.out.println(creator.createXmasTree(character, nOfLevels, direction));
    }

}
