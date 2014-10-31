package com.lef.readjava;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
	final Lock lock = new ReentrantLock();// ������
	final Condition notFull = lock.newCondition();// д�߳�����
	final Condition notEmpty = lock.newCondition();// ���߳�����

	final Object[] items = new Object[100];// �������
	int putptr/* д���� */, takeptr/* ������ */, count/* �����д��ڵ����ݸ��� */;

	public void put(Object x) throws InterruptedException {
		lock.lock();
		try {
			while (count == items.length)
				// �����������
				notFull.await();// ����д�߳�
			items[putptr] = x;// ��ֵ
			if (++putptr == items.length)
				putptr = 0;// ���д����д�����е����һ��λ���ˣ���ô��Ϊ0
			++count;// ����++
			notEmpty.signal();// ���Ѷ��߳�
		} finally {
			lock.unlock();
		}
	}

	public Object take() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0)
				// �������Ϊ��
				notEmpty.await();// �������߳�
			Object x = items[takeptr];// ȡֵ
			if (++takeptr == items.length)
				takeptr = 0;// ����������������е����һ��λ���ˣ���ô��Ϊ0
			--count;// ����--
			notFull.signal();// ����д�߳�
			return x;
		} finally {
			lock.unlock();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BoundedBuffer a = new BoundedBuffer();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 500; i++) {
					try {
						a.put("aa");
						System.out.println(a.count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 500; i++) {
					try {
						a.take();
						System.out.println(a.count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 500; i++) {
					try {
						a.put("aa");
						System.out.println(a.count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}).start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 500; i++) {
					try {
						a.take();
						System.out.println(a.count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}).start();
		
	}

}
