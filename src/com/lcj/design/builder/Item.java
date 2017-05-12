package com.lcj.design.builder;

/**
 * 建造者模式——主题接口
 * @author user
 *
 */
public interface Item {
	
	public String name();
	
	public float price();
	
	public Packing packing();

}
