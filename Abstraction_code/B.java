package Abstraction_code;

class B implements A 
{
	 int speed = 0;
	 int gear = 1;
	 // implementation
	 public void changeGear(int newValue) 
	 {
	         gear = newValue;
	  }
	  public void speedUp(int increment) {
	         speed = speed + increment; 
	  }
	   public void applyBrakes(int decrement) {
	         speed = speed - decrement;
	   }
	    void printStates() {
	          System.out.println(" speed:" + speed + " gear:" + gear);
	    }
	}