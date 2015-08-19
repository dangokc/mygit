
public class Utilities 
{
	/**
	 * Utilities class is a class that defines a set of methods that perform common, often re-used functions.
	 * Get equality without worrying about null pointer exceptions.
	 * @param one the first object to compare to
	 * @param two the second object to compare for equality
	 * @return true if equal, else false.
	 */
	public static boolean nullSafeEquals(Object one, Object two)
	{
		//to prevent a Null Pointer Exception, the left object
		//or implicit object cannot be null.  It won't matter
		//if the right object (or explicit object) is null)
		return one == null ? two == null : one.equals(two);
	}
}
