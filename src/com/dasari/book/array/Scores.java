package com.dasari.book.array;

public class Scores {
	public static final int maxEntries = 10;
	protected int numEntries;
	protected GameEntry[] entries;

	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}

	public void displayAllGameEntries() {
		for (int i = 0; i < entries.length; i++) {
			System.out.println("Name:" + entries[i].getName() + ", Score:" + entries[i].getScore());

		}
	}

	// adding entry

	public void addGameEntry(GameEntry entry) {
		int newScore = entry.getScore();
		if (numEntries == numEntries) {
			if (newScore <= entries[numEntries - 1].getScore()) {
				return;
			} else {
				numEntries++;
				int i = numEntries - 1;
				for (; (i >= 1) && (newScore > entries[i - 1].getScore()); i--) {
					entries[i] = entries[i - 1];
					entries[i] = entry;
				}
			}
		}
	}

	public GameEntry removeEntry(int index) {
		GameEntry gameEntry=null;
		if((index<0)&&(index>numEntries)) {
			throw new IndexOutOfBoundsException(index+" is out of index");
		}else {
			gameEntry=entries[index];
			for(int i=index;i<numEntries-1;i++) {
				entries[i]=entries[i+1];
				entries[numEntries-1]=null;
				numEntries--;
			}
		}
		return gameEntry;
	}

}
