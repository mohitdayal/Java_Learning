package com.designpattern.chap11.dynamicproxy;

public class PersonBeanImpl implements PersonBean
{
	private String name;
	private String gender;
	private String interest;
	private int rating;
	private int ratingcount;

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getGender()
	{
		return gender;
	}

	@Override
	public String getInterest()
	{
		return interest;
	}

	@Override
	public int getHotOrNotRating()
	{
		return rating;
	}

	@Override
	public void setName(String s)
	{
		name = s;
	}

	@Override
	public void setGender(String s)
	{
		gender = s;
	}

	@Override
	public void setInterest(String s)
	{
		interest = s;
	}

	@Override
	public void setHotOrNotRating(int i)
	{
		rating = i;
	}

}
