package b1;

public class TestVitesse {

	public static void main(String[] args) {
		long timestamp1, timestamp2;
		
		V1 v1 = new V1();
		V2 v2 = new V2();
		long maxI = 1_000_000_0000L;
		
		System.out.println(v1.v);
		timestamp1 = System.currentTimeMillis();
		for (long i = 0; i < maxI; i++) {
			v1.v++;
		}
		timestamp2 = System.currentTimeMillis();
		System.out.println(v1.v);
		System.out.println(timestamp2 - timestamp1);
		
		System.out.println("-----------------");
		
		System.out.println(v2.getV());
		timestamp1 = System.currentTimeMillis();
		for (long i = 0; i < maxI; i++) {
			v2.setV(v2.getV() + 1);
		}
		timestamp2 = System.currentTimeMillis();
		System.out.println(v2.getV());
		System.out.println(timestamp2 - timestamp1);
		

	}

}

class V1 {
	public long v = 0;
}
class V2 {
	private long v = 0;

	public long getV() {return v;}
	public void setV(long v) {this.v = v;}
	
}