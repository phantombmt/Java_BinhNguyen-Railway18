
public class Labelled_Block {

	public static void main(String[] args) {

		int x = 21;

		l1: {
			System.out.println("Block begins");
			if (x == 20) {
				break l1;
			}
			System.out.println("Block ends");
		}
		System.out.println("Out side of the block");
	}

}
