package android;

      public class Rama {
	   public void simpleMessage(String name){
	        System.out.println("Hello " + name);
	    }
	   
//Many methods and instances   
	
	   private String girlName;
	   
	    public void setName(String name){
	        girlName=name;
	    }
	
	    
	    public String getName(){
	        return girlName;
	    }
	    public void saying(){
	        System.out.printf("Your first gf was %s", getName());
	    }
	    
}
