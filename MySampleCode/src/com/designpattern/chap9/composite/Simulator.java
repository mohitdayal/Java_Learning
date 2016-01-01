package com.designpattern.chap9.composite;

public class Simulator
{
	public static void main(String[] args)
	{
		MenuComponent panCakeHouse = new Menu("Pancake House Menu", "Breakfast");
		MenuComponent dinnerMenu = new Menu("Diner Menu", "Lunch");
		MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
		MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert Of Course");
		
		
		MenuComponent allMenus = new Menu("All Menus", "All Menus combined");
		
		allMenus.add(cafeMenu);
		allMenus.add(panCakeHouse);
		allMenus.add(dinnerMenu);
		
		// Add menu items.
		
		dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara sauce, and a slice of sourdough bread", 3.89, true));
		
		dinnerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with flakey crust, topped with vanila icecream", 1.59, true));
		
		//---------------
		
		Waitress waitress = new Waitress(allMenus);
		
		waitress.print();
	
	}
}
