package com.dasari.generics.book;

public class MemoryCellSimulator {

	public static void main(String[] args) {
		MemoryCell memoryCell = new MemoryCell();
		memoryCell.write("504");
		String storedValue=(String) memoryCell.read();
		System.out.println(storedValue);
		
		MemoryCell memoryCellInterfaceType = new MemoryCell();
		memoryCellInterfaceType.write(new Integer(508));
		Integer storedValueInf=(Integer) memoryCellInterfaceType.read();
		System.out.println(storedValueInf);
	}
}
