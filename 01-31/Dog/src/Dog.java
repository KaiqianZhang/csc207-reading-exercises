/**
 * 
 */

/**
 * @author Kaiqian
 *
 */
public class Dog {
    public String name;
    public double weight;
    public int age;
    
    public Dog(){
    	this.name = "";
    	this.weight = 0.0;
    	this.age = 0;
    }
    
    public Dog(String name, double weight, int age){
    	this.name = name;
    	this.weight = weight;
    	this.age = age;
    }
    
    public String getName(){
    	return this.name;
    }
    
    public double getWeight(){
    	return this.weight;
    }
    
    public void addWeight(){
    	this.weight += 2;
    }
    
	public static void main(String[] args) {
		Dog myDog = new Dog("Baby", 10, 8);
		myDog.addWeight();
		System.out.printf("%s's weight now is %f.", myDog.getName(), myDog.getWeight());
	}

}
