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
	 * ˫�˶��У�ʵ�����ڶ�ͷ�Ͷ�β��Ч�Ĳ����ɾ��
	 */
	ArrayDeque<String> b5;
	LinkedBlockingDeque<String>b6;
	{
		/**
		 * ���ط���ʵ�ֵģ���Ч��
		 */
		System.arraycopy(new String[]{}, 0, a, 0, 0);
	}
	
	/**
	 * ���ܼ�����ִ�ж�ռ���ʣ�����޷�ʹ�ÿͻ��˼����������µ�ԭ�Ӳ���
	 */
	ConcurrentHashMap<String, String> c;
	/**
	 * ���ӳ������ϲ���������
	 */
	ConcurrentMap<String, String>f;
	
	ConcurrentSkipListMap<String, String>d;
	ConcurrentSkipListSet<String>e;
	
	CopyOnWriteArrayList<String>g;
	
	/**
	 * �̳߳ص�ʹ��
	 */
	ExecutorService threadPool = Executors.newCachedThreadPool();  
    CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);
	
}
