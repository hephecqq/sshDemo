package com.kostech.test;

public class RedDuck extends Duck {

	
	public RedDuck(GagI gag, FlyI fly) {
		fly=new GoodFlyI();
		gag=new GoodGagI();
	}
	
	//策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。
	//原则就是：分离变化部分，封装接口，基于接口编程各种功能。
	//此模式让行为算法的变化独立于算法的使用者。

}
