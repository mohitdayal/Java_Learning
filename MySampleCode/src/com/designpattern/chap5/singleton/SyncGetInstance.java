package com.designpattern.chap5.singleton;

// thread safe but heavy getInstance method

public class SyncGetInstance {

	static SyncGetInstance singleInst;

	private SyncGetInstance() {
	}

	public static synchronized SyncGetInstance getInstance() {
		if (singleInst == null) {
			singleInst = new SyncGetInstance();
		}

		return singleInst;
	}

}
