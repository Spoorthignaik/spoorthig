package com.xworkz.objects.boot;

import com.xworkz.objects.Chain;
import com.xworkz.objects.ChainAccess;

public class ChainRunner {

		
		
		public static void main(String[] args) {
			
			ChainAccess chainAccess = new ChainAccess();
			Chain chain = new Chain();

			System.out.println(chain.getType());
			System.out.println(chain.getPrice());
			System.out.println(chain.getLength());
			System.out.println(chain.getMaterial());
			System.out.println(chain.getWeight());
			System.out.println(chain.isStolen());
			System.out.println(chain.isFresh());
			System.out.println(chain.getUsedFor());
			System.out.println(chain.getBrand());
			System.out.println(chain.isRound());
			System.out.println(chain.isOld());

			System.out.println(System.lineSeparator());
			chainAccess.chain1(chain);
			
			
			}
			
			
		
		
		
		
		
	}

