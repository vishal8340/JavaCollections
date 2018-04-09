package java_project;

public class FinalizeConcept {

	public void finalize() {

		System.out.println("Finalize Method");
	}

	public static void main(String[] args) {
		// finalize is keyword to perform clean up in other word to release unused
		// memory

		@SuppressWarnings("unused")
		FinalizeConcept f1 = new FinalizeConcept();
		@SuppressWarnings("unused")
		FinalizeConcept f2 = new FinalizeConcept();
		f1 = null;
		f2 = null;
		System.gc();

	}

}
