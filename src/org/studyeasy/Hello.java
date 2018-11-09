package org.studyeasy;

import org.studyeasy.phone.Nokia3310;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.SamsungNote8;

public class Hello {

	public static void main(String[] args) {
		
		/*Phone phone =new Phone("Nokia 3310");
		System.out.println(phone.getModel());
		phone.features();
		
		SamsungNote8 not8 = new SamsungNote8("Not8") ;
		System.out.println(not8.getModel());
		not8.features();
		*/
		
		Phone not8=new SamsungNote8("Not8");
		System.out.println(not8.getModel());
		not8.features();
		
		Phone nokia3310=new Nokia3310("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();

	}

}
