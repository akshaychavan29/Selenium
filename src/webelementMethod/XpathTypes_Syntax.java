package webelementMethod;

public class XpathTypes_Syntax {

	public static void main(String[] args) 
	{

		//1.	xpath by attribute
		   //tagname[@attribute name = ‘attribute value’]
		
		//2.	xpath by text
		   //tagname[text() = ‘textvalue’]
		
		//3.	xpath by contains()
		    //I.	Contains with text() :
			//tagname[contains(text(),’textvalue’)]
			
			//II.	Contains with attribute :
		    //tagname[contains(@attribute name, ‘attribute value’)]
		
		//4.	xpath by index
		//tagname[@attribute name = ‘attribute value’] )[2]
		//tagname[text() = ‘textvalue’] )[2]
		//we can use contains method also
	}

}
