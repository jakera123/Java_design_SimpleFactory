package com.zxp.design;

public class FoodFactory {
	
	public static Food getFood(String type) throws InstantiationException,IllegalAccessException,ClassNotFoundException{
	
		if(type.equalsIgnoreCase("mcchicken")){
			return (Food) MCChicken.class.newInstance();
		}else if(type.equalsIgnoreCase("chips")){
			return (Food) Chips.class.newInstance();
		}else{
			System.out.println("哎呀，找不到相应的实例化类啦");
			return null;
		}
		
		
	}
	
	
}
