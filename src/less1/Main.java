package less1;
import static java.util.Arrays.asList;


public class Main {

    public static void main(String[] args) {

	    //задание 1 swap
	    String  array1[] = {"a","b","c","d","e"};
	    swap(array1,0,4);

	    //задание 2
	    String array2[] = {"A","B","C","D","E"};
	    asList(array2);

	    //задание 3

	    Apple apple1 = new Apple();
	    Apple apple2 = new Apple();
	    Apple apple3 = new Apple();

	    Orange orange1 = new Orange();
	    Orange orange2 = new Orange();

	    Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
	    Box<Orange> box2 = new Box<Orange>(orange1, orange2);

	    System.out.println(box1.compare(box2));

	    Box<Orange> box3 = new Box<Orange>();
	    box2.transfer(box3);

    }

	private static void swap(String[]  array1, int i, int i1) {
		if (i != i1) {
			try {
				String temp = array1[i];
				array1[i] = array1[i1];
				array1[i1] = temp;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("oops");
			}
		}
	}
}
