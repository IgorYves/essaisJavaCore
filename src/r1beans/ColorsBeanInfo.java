package r1beans;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ColorsBeanInfo extends SimpleBeanInfo {
	@Override
	public PropertyDescriptor[] getPropertyDescriptors() {
		try {
			PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
			PropertyDescriptor[] pd = {rectangular};
			return pd;
		} catch (Exception e) {
			System.out.println("ColorsBeanInfo problem -> " + e);
		}
		return null;
	}
}
