//// create a class called Main with two attributes x and y 
public class ClassAttributes {
      int x = 3;
      int y = 5;
      int z; /// modify attributes
      int zz = 55; // changes the values
      int s = 26; /// multiple objectS
      
      /////Multiple attributs
      String fname = "Sruthi";
      String lname = "Ram";
      int age = 26;
      
      //// accessing attributes
      public static void main(String[] args) {
    	  ClassAttributes myObj = new  ClassAttributes();
    	  System.out.println(myObj.x);
    	  System.out.println(myObj.y);
    	  
    	  ///Set the value of z to 33:
    	  myObj.z = 33; /// modify attributes
    	  System.out.println(myObj.z); /// modify attributes
    	  
    	// changes the values
    	  myObj.zz = 25;
    	  System.out.println(myObj.zz); 
    	  
    	  
    	  /// multiple objectS
    	  ClassAttributes myObj1 = new ClassAttributes();// obj 1
    	  ClassAttributes myObj2 = new ClassAttributes();// obj 2
    	  myObj2.s = 2606;
    	  System.out.println(myObj1.s);
    	  System.out.println(myObj2.s);
    	  
    	/////Multiple attributs
    	  System.out.println("Name: " + myObj.fname + "" + myObj.lname);
    	  System.out.println("Age: " + myObj.age);
    	  
      }
}


