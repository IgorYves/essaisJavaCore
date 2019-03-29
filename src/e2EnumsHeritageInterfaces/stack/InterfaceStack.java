package e2EnumsHeritageInterfaces.stack;

interface InterfaceStack {
	int CONST = 10;//constante utilisable dans n'importe quel class/obj implementant interface
	void put(int x);
	int get();
	default boolean isEmpty() {return false;};// on l'appelle objectInstance.isEmpty()
	static int getConst() {return CONST;};//on l'appelle InterfaceStack.getConst()
};
