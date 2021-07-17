package com.dasari.fundamentals.FINAL.BLANK;

public class FinalBlankClient {
	public final Integer FINAL_BLANK;
	public static final Integer STATIC_FINAL_BLANK;

	static {
		STATIC_FINAL_BLANK = 508;
	}

	public FinalBlankClient() {
		this(408);
	}

	public FinalBlankClient(Integer fINAL_BLANK) {
		FINAL_BLANK = fINAL_BLANK;
	}

}
