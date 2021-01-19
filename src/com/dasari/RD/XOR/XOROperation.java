package com.dasari.RD.XOR;

public class XOROperation {
	public Boolean xorOperationPerformer(Boolean inputNodeOne, Boolean inputNodeTwo) {
		Boolean xorOpertionOutput = false;
		if (inputBooleanToNumberConverter(inputNodeOne) == 1 && inputBooleanToNumberConverter(inputNodeOne) == 1) {
			xorOpertionOutput=false;
		}else if(inputBooleanToNumberConverter(inputNodeOne) == 0 && inputBooleanToNumberConverter(inputNodeOne) == 0) {
			xorOpertionOutput=false;
		}else if(inputBooleanToNumberConverter(inputNodeOne) == 0 && inputBooleanToNumberConverter(inputNodeOne) == 1) {
			xorOpertionOutput=true;
		}else if(inputBooleanToNumberConverter(inputNodeOne) == 1 && inputBooleanToNumberConverter(inputNodeOne) == 0) {
			xorOpertionOutput=true;
		}

			return xorOpertionOutput;
	}

	private Integer inputBooleanToNumberConverter(Boolean inputNode) {
		Integer numericOutPut = 0;
		if (inputNode == true) {
			numericOutPut = 1;
		} else {
			numericOutPut = 0;
		}
		return numericOutPut;
	}
}
