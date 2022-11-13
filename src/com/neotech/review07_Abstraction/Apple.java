package com.neotech.review07_Abstraction;

	// You can extend one and only one class
	// You can implement multiple interfaces
	public class Apple extends Fruit implements Peelable, Washable {
	
		public Apple(String color) {
			super(color);
		}
	
		@Override
		public void peel() {
			System.out.println("Peeling the apple.");
		}
	
		@Override
		public void wash() {
			System.out.println("Washing the apple.");
		}
	}

