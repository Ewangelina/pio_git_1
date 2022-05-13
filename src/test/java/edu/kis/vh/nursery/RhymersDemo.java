package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo
{

	public static void main(String[] args)
	{
		RhymersFactory factory = new DefaultRhymersFactory();

		testRhymers(factory);

	}

	private static void testRhymers(RhymersFactory factory)
	{
		//Separate testing of each rhymer could help with finding errors
		//TODO: test each rhymer separately with specific tests not all identically in one function
		DefaultCountingOutRhymer[] rhymers =
		{
			factory.getStandardRhymer(), factory.getFalseRhymer(),
			factory.getFIFORhymer(), factory.getHanoiRhymer()
		};

		for (int i = 1; i < 15; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				rhymers[j].countIn(i);
			}
		}

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
		{
			rhymers[3].countIn(rn.nextInt(20));
		}

		//This isn't really a test just a print out
		//TODO: delete if unnecessary otherwise move into different function: print
		for (DefaultCountingOutRhymer rhymer : rhymers)
		{
			while (!rhymer.callCheck())
			{
				System.out.print(rhymer.countOut() + "  ");
			}
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());
	}

}
