package com.designpattern.chap5.singleton;

// pure thread safe;

public class EagerInit {

	static private EagerInit singleInst = new EagerInit();

	private EagerInit() {
	}

	public static EagerInit getInstance() {
		return singleInst;
	}

}
