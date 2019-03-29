package f3jUtil2;

import java.util.BitSet;

class JUtil202 {

	public static void main(String[] args) {
		BitSet bs = new BitSet();
		bs.set(0);
		bs.set(1);
		bs.set(2);
		bs.set(3);
		
		BitSet bs2 = new BitSet();
		bs2.set(0);
		bs2.set(1);
		bs2.set(2);
		bs2.set(3);
		
		System.out.println(bs);
		System.out.println(bs2);
		byte[] b = bs.toByteArray();
		for (byte c : b) {
			System.out.print(c + " ");
		}
		System.out.println("\n-----------");
		bs.flip(1);
		System.out.println(bs);
		System.out.println(bs2);
		System.out.println("\n-----------");
		bs.and(bs2);
		System.out.println(bs);
		
	}
}
