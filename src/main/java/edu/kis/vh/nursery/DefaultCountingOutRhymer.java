package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer
{

	public static final int ROZMIAR = 12;
	public static final int TOTAL = -1;
	public static final int FULL = 11;
	private int[] NUMBERS = new int[ROZMIAR];

	private int total = -1;

	public int getTotal() {
		return total;
	}

	protected void countIn(int in)
	{
		if (!isFull())
		{
			NUMBERS[++total] = in;
		}
	}

	protected boolean callCheck()
	{
		return total == TOTAL;
	}

	protected boolean isFull()
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

	protected int countOut()
	{
		if (callCheck())
		{
			return TOTAL;
		}
		return NUMBERS[total--];
	}

	public int[] getNUMBERS() {
		return NUMBERS;
	}
}
