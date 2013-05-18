package com.sp.rmi.impl;

import com.sp.rmi.QueueService;

public class QueueServiceImpl implements QueueService {

	public void add(String name) {
		System.out.println("============>>>"+name);
	}

}
