package ct.common.adv.concurrent.prodncon;

public enum RequestType {
	/**
	 * New Data insertion request
	 */
	insert,
	
	/**
	 * change the Existing data with the passed values
	 */
	update,

	delete,
	
	select

}
