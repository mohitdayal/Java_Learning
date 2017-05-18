package com.test.java.general;

public class ClassLoading {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ClassLoading cl= new ClassLoading();
		
		ClassLoader myCloader = cl.getClass().getClassLoader();
		Thread t = new Thread();
		ClassLoader systemClassLoader = t.getClass().getClassLoader();
		System.out.println(myCloader.toString());
		System.out.println(systemClassLoader);
		System.out.println(Thread.currentThread().getContextClassLoader().toString());
	
		ClassLoader classLoader = new MyClassLoader() ;
		final Class<?> loadedClass = classLoader.loadClass("com.test.java.general.ClassLoading");
		Object newInstance = loadedClass.newInstance();
		System.out.println(newInstance.getClass().getClassLoader());
		System.out.println("end of main");
	}
}

class MyClassLoader extends ClassLoader{
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.findClass(name);
	}
	
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.loadClass(name);
	}
}
