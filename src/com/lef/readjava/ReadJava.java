package com.lef.readjava;

import java.util.ArrayDeque;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ReadJava {
	Vector a;
	BlockingQueue< String> b;
	ArrayBlockingQueue<String>b1;
	LinkedBlockingQueue<String>b2;
	PriorityBlockingQueue<String>b3;
	SynchronousQueue<String>b4;
	/**
	 * 双端队列，实现了在队头和队尾高效的插入和删除
	 */
	ArrayDeque<String> b5;
	LinkedBlockingDeque<String>b6;
	{
		/**
		 * 本地方法实现的，高效率
		 */
		System.arraycopy(new String[]{}, 0, a, 0, 0);
	}
	
	/**
	 * 不能加锁来执行独占访问，因此无法使用客户端加锁来创建新的原子操作
	 */
	ConcurrentHashMap<String, String> c;
	/**
	 * 增加常见符合操作的容器
	 */
	ConcurrentMap<String, String>f;
	
	ConcurrentSkipListMap<String, String>d;
	ConcurrentSkipListSet<String>e;
	
	CopyOnWriteArrayList<String>g;
	
	/**
	 * 线程池的使用
	 */
	ExecutorService threadPool = Executors.newCachedThreadPool();  
    CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);
	
}
