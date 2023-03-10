// specify the package
package model;

// system imports
import userinterface.InsertPatronView;


import java.util.Vector;
import javax.swing.JFrame;

// project imports

/** The class containing the TransactionFactory for the ATM application */
//==============================================================
public class TransactionFactory
{

	/**
	 *
	 */
	//----------------------------------------------------------
	public static Transaction createTransaction(String transType) throws Exception
	{
		Transaction retValue = null;

		if (transType.equals("InsertPatron") == true)
		{
			retValue = new InsertPatronTransaction();
		}
		else if (transType.equals("InsertBook") == true)
		{
			retValue = new InsertBookTransaction();
		}
		else if (transType.equals("SearchBook") == true)
		{
			retValue = new SearchBookTransaction();
		}
		else if (transType.equals("SearchPatron") == true)
		{
			retValue = new SearchPatronTransaction();
		}


		return retValue;
	}
}
