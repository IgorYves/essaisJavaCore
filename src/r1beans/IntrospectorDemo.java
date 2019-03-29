package r1beans;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectorDemo {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("r1beans.Colors");
			BeanInfo beanInfo = Introspector.getBeanInfo(c);
			
			System.out.println("proprety :");
			PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor pd : propertyDescriptor) {
				System.out.println("\t" + pd.getName());
			}

			System.out.println("events :");
			EventSetDescriptor[] eventSetDescriptor = beanInfo.getEventSetDescriptors();
			for (EventSetDescriptor es : eventSetDescriptor) {
				System.out.println("\t" + es.getName());
			}
			
		}catch (Exception e) {
			System.out.println("IntrospectorDemo problem -> " + e);
		}

	}

}
