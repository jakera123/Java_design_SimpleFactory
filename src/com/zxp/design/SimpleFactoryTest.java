package com.zxp.design;

public class SimpleFactoryTest {
	public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException{
		
		Food mcChicken=FoodFactory.getFood("McChicken");
		Food chips=FoodFactory.getFood("Chips");
		Food eggs=FoodFactory.getFood("Eggs");
		
		
		if(mcChicken!=null){
			mcChicken.get();
		}
		if(chips!=null){
			chips.get();
		}
		if(eggs!=null){
			eggs.get();
		}
		
		
		
		
	}

}
