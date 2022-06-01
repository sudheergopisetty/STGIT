package aggignment.Model;

public class Question7 {
	class Cycle{
	    String define_me(){
	        return "a vehicle with pedals.";
	    }
	}

	public class Bike extends Cycle{
	    String define_me(){
	        return "a cycle with an engine.";
	    }
	    
	    public void B(){
	        System.out.println("Hello I am a Bike I am "+ define_me());
	        String temp=define_me();
	        System.out.println("My ancestor is a cycle who is "+ temp );
	    }
	    
	}
	

}

