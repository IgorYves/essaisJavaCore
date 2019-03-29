package f1jLang;

class JLnag3 {

	public static void main(String[] args) throws SecurityException, NoSuchFieldException {
		JL3 jl3 = new JL3();
		JL32 jl32 = new JL32();
		Class<?> clObj;
		clObj = jl3.getClass();
		System.out.println(clObj.getName());
		System.out.println(jl3.getClass().getName());
		System.out.println(jl32.getClass().getName());
		System.out.println(jl32.getClass().getSuperclass().getName());
		System.out.println(jl32.getClass().getSuperclass().getSuperclass().getName());
		System.out.println(jl3.getClass().getSuperclass().getName());
		System.out.println("----------------");
		System.out.println(jl32.getClass().getDeclaredField("j"));
		System.out.println(Math.toRadians(180));
	}
	
}

class JL3 {
	int i = 2;
	float f = 1.0F;
}

class JL32 extends JL3 {
	int j = 2;
	double d = 1.0;
}