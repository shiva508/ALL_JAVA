package com.dasari.book.array;

public class HighArray {
	private LowArray arr;
	private int nElems;

	public HighArray(int maxArrayLength) {
		arr = new LowArray(maxArrayLength);
		nElems = maxArrayLength;
	}

	public boolean findArrayValue(long searchValue) {
		boolean isFound = false;
		for (int i = 0; i < nElems; i++) {
			if (arr.getArrayValue(i) == searchValue) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}
	
	public boolean deleteArrayValue(long deleteValue) {
		boolean isElementDeleted=false;
		int indexOfDeleteElement=findElementIndex(deleteValue);
		for (int i = indexOfDeleteElement; i < arr.arrayLength()-1; i++) {
			arr.setArrayValue(i, arr.getArrayValue(i+1));
			isElementDeleted=true;
		}
		return isElementDeleted;
	}

	public int findElementIndex(long deleteValue) {
		int deleteIndex=-1;
		for (int i = 0; i < arr.arrayLength()-1; i++) {
			if(arr.getArrayValue(i)==deleteValue) {
				deleteIndex=i;
				nElems--;
				break;
			}
		}
		return deleteIndex;
	}
	
	public void setArrayValue(int index,long value) {
		arr.setArrayValue(index, value);
	}
	
	public int lengthOfArray() {
		return arr.arrayLength();
	}
	
	public void printArray() {
		long []arraylist=arr.getAllArrayValues();
		int length=arraylist.length;
		for (int i = 0; i < length-1; i++) {
			System.out.println(arraylist[i]);
		}
		
	}
}
