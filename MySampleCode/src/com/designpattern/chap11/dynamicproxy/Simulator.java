package com.designpattern.chap11.dynamicproxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class Simulator
{
	ArrayList<PersonBean> persons = new ArrayList<PersonBean>();

	public Simulator()
	{
		createDataBase();
	}

	PersonBean getOwnerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}

	PersonBean getNonOwnerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
				person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
	
	public static void main(String[] args)
	{
		Simulator s = new Simulator();
		PersonBean paul = s.persons.get(0);
		PersonBean ownerBean = s.getOwnerProxy(paul);
		System.out.println("Name is: "+ownerBean.getName());
		System.out.println("Interest is: "+ownerBean.getInterest());
		ownerBean.setInterest("Bowling Go.");
		
		try
		{
			System.out.println("Trying to set hotornot rating from owner proxy.");
			ownerBean.setHotOrNotRating(4);
		} catch (Exception e)
		{
			System.err.println("Cannot set hotornot from owner Proxy.");
		}
		
		System.out.println("Current rating is: "+ ownerBean.getHotOrNotRating());
		
		System.out.println("Now working with nonOwnerProxy.");
		PersonBean nonOwnerProxy  = s.getNonOwnerProxy(paul);
		System.out.println("Name is: "+nonOwnerProxy.getName());
		System.out.println("Interest is: "+nonOwnerProxy.getInterest());
		try
		{
			System.out.println("Trying to set hotornot rating from owner proxy.");
			nonOwnerProxy.setInterest(" Running .. go...");
		} catch (Exception e)
		{
			System.err.println("Cannot set intrest  from nonowner Proxy.");
		}
		
		nonOwnerProxy.setHotOrNotRating(10);
		System.out.println("Current rating is: "+ ownerBean.getHotOrNotRating());
		System.out.println("Interest is: "+ownerBean.getInterest());
	}

	private void createDataBase()
	{
		PersonBean paul = new PersonBeanImpl();
		paul.setName("Paul");
		paul.setGender("Male");
		paul.setInterest("Football");

		PersonBean mark = new PersonBeanImpl();
		mark.setName("Mark");
		mark.setGender("Male");
		mark.setInterest("Scoccer");

		PersonBean lisa = new PersonBeanImpl();
		lisa.setName("Lisa");
		lisa.setGender("Female");
		lisa.setInterest("BasketBall");

		PersonBean john = new PersonBeanImpl();
		john.setName("John");
		john.setGender("Male");
		john.setInterest("Hockey");

		PersonBean penny = new PersonBeanImpl();
		penny.setName("Penny");
		penny.setGender("Female");
		penny.setInterest("Politics");

		PersonBean sam = new PersonBeanImpl();
		sam.setName("Sam");
		sam.setGender("Male");
		sam.setInterest("Hiking");

		persons.add(paul);
		persons.add(mark);
		persons.add(lisa);
		persons.add(john);
		persons.add(penny);
		persons.add(sam);

	}
}
