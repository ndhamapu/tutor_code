package cio.common.hibernate.example1;



public enum Side
{
	/**
	 * Buy form Client Perspective
	 */
	BUY,
	/**
	 * Sell Side from Client Perspective
	 */
	SELL;

	public static Side identifySide(String side)
	{
		return ("BUY".equalsIgnoreCase(side) ? Side.BUY : Side.SELL);
	}
}
