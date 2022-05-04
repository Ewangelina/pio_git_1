package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{

	public static final int ROZMIAR = 12;
	public static final int TOTAL = -1;
	public static final int FULL = 11;
	private int[] NUMBERS = new int[ROZMIAR];

	public int total = TOTAL;

	public void countIn(int in)
	{
		if (!isFull())
		{
			NUMBERS[++total] = in;
		}
	}

	public boolean callCheck()
	{
		return total == TOTAL;
	}

	public boolean isFull()
	{
		return total == FULL;
	}

	protected int peekaboo()
	{
		if (callCheck())
		{
			return TOTAL;
		}
		return NUMBERS[total];
	}

	public int countOut()
	{
		if (callCheck())
		{
			return TOTAL;
		}
		return NUMBERS[total--];
	}

}
