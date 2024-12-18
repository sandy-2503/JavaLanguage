package com.sandeep.java11.newfeature;

public class NestedBasedAccessControl {
	public void myPublic() {
		System.out.println("My Public");
    }
 
    private void myPrivate() {
    	System.out.println("My Private");
    }
 
    class Nested {
 
        public void nestedPublic() {
            myPrivate();
        }
    }
}
