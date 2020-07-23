package Example2;

public class BoreWell {

	Water pump() {
		
		Water w = new Water();
		System.out.println("Bore well pumped");
		return w;
	}

	public static void main(String[] args) {
		
		BoreWell bw = new BoreWell();
		System.out.println("running");
		bw.pump();
		System.out.println("stopped");
	}
}
