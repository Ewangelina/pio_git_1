package edu.kis.vh.nursery;

/**
 *
 */
public class DefaultCountingOutRhymer
{

	public static final int MAX_SIZE = 12;
	public static final int EMPTY = -1;
	public static final int DEFAULT = -1;

	private final int[] NUMBERS = new int[MAX_SIZE];

	private int total = EMPTY;

	/**
	 * @param in
	 */
	public void countIn(int in)
	{
		if (!isFull())
		{
			NUMBERS[++total] = in;
		}
	}

	/**
	 * @return
	 */
	public boolean callCheck()
	{
		return total == EMPTY;
	}

	/**
	 * @return
	 */
	public boolean isFull()
	{
		return total == MAX_SIZE - 1;
	}

	/**
	 * @return
	 */
	protected int peekaboo()
	{
		if (callCheck())
		{
			return DEFAULT;
		}
		return NUMBERS[total];
	}

	/**
	 * @return
	 */
	public int countOut()
	{
		if (callCheck())
		{
			return DEFAULT;
		}
		return NUMBERS[total--];
	}
}
