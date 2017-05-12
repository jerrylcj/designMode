package com.lcj.design.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Ì×²ÍÀà
 * @author user
 *
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	/**
	 * Ìí¼Óitem
	 * @param item
	 */
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems(){

      for (Item item : items) {
         System.out.print("Item : " + item.name());
         System.out.print(", Packing : " + item.packing().pack());
         System.out.println(", Price : " + item.price());
      }        
    }    
}
