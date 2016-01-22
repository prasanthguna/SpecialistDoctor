public class SpecialistDoctor 

{
    public String decease;



    public void setDecease( String decease)
    {
        this.decease = decease;
    }


	public String getDoctor()
	{
		if(decease.equalsIgnoreCase("Heart"))
		{
			return "Vel";		
		}
		else if(decease.equalsIgnoreCase("Kidney"))
		{
			return "Prasanth";
		}
		else if(decease.equalsIgnoreCase("Liver"))
		{
			return "Ram";	
		}
		else if(decease.equalsIgnoreCase("ENT"))
		{
			return "Karthik";	
		}
		else if(decease.equalsIgnoreCase("DNA"))
		{
			return "Praveen";	
		}
      
      return null;
    }	
}