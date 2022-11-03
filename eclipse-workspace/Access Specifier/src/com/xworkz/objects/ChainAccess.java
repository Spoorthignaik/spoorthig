package com.xworkz.objects;

public class ChainAccess {

	public Chain chain;

	public void chain1(Chain chain) {

		System.out.println(chain.getType());
		chain.setType("closed");
		System.out.println("modified name" + chain.getType());

		System.out.println(chain.getBrand());
		chain.setBrand("loyal");
		System.out.println("modified name" + chain.getBrand());

		System.out.println(chain.getPrice());
		chain.setPrice(687849);
		System.out.println("modified name" + chain.getPrice());

		System.out.println(chain.getLength());
		chain.setLength(100.5);
		System.out.println("modified name" + chain.getLength());

		System.out.println(chain.getMaterial());
		chain.setMaterial("polyster");
		System.out.println("modified name" + chain.getMaterial());

		System.out.println(chain.getWeight());
		chain.setWeight(789.9);
		System.out.println("modified name" + chain.getWeight());

		System.out.println(chain.isStolen());
		chain.setStolen(true);
		System.out.println("modified name" + chain.isStolen());

		System.out.println(chain.getUsedFor());
		chain.setUsedFor("trip");
		System.out.println("modified name" + chain.getUsedFor());

		System.out.println(chain.isRound());
		chain.setRound(false);
		System.out.println("modified name" + chain.isRound());

		System.out.println(chain.isOld());
		chain.setOld(true);
		System.out.println("modified name" + chain.isOld());

		System.out.println(chain.isFresh());
		chain.setFresh(true);
		System.out.println("modified name" + chain.isFresh());

	}

}
