package com.masai;

public class Demo {
	public Animal[] getAnimals() {
		Animal cat=new Cat();
		Animal dog=new Dog();
		Animal tiger=new Tiger();
		Animal[] animals= {cat,dog,tiger};
		return animals;
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Animal[] animals=d1.getAnimals();
		for(Animal i:animals) {
			i.eat();
			i.walk();
			i.makeNoise();
			if(i instanceof Dog) {
				Dog dog=(Dog)i;
				dog.handShake();
			}
		}
	}
}
