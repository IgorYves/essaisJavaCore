/**
 * 
 */
package tpGetAge;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author hugot yves
 *
 */
/**
 * @author admin
 *
 */
class GetAgeT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//getAgeTestable(new Date(), new Date());
		int year = 2018;
		int month = 11;//0,1,2,3,4,5,6,7,8,9,10,11
		int day = 18;
		//System.out.println(getAge(new GregorianCalendar(year, month, day).getTime()));
		for (int i=15; i<25; i++) {
			day = i;
			System.out.println(getAge(new GregorianCalendar(year, month, day).getTime()));
		}
	}
	
	/**
	 * methode return l'age à partir de dates entrées en parametres
	 *  prend en compte si date est deja passée cette année, 
	 *  pour les nouveau-nés retourn 0, 
	 *  pour les dates en future retourn nombre negative
	 * @param year jour de naissance
	 * @param month mois de naissance
	 * @param day jour de naissance
	 * @return retourn age en années
	 */
	public static int getAge(int year, int month, int day) {
		return getAge(new GregorianCalendar(year, month, day).getTime());
	}
	public static int getAge(Date dateNaiss) {
		return getAgeTestable(dateNaiss, new Date());
	}
	public static int getAgeTestable(Date dateNaiss, Date maintenant) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(dateNaiss);
		int dayBirth = calendar.get(Calendar.DAY_OF_MONTH);
		int monthBirth = calendar.get(Calendar.MONTH);
		int yearBirth = calendar.get(Calendar.YEAR);
		
		calendar.setTime(maintenant);
		int dayNow = calendar.get(Calendar.DAY_OF_MONTH);
		int monthNow = calendar.get(Calendar.MONTH);
		int yearNow = calendar.get(Calendar.YEAR);
		if (monthBirth > monthNow) {return yearNow - yearBirth - 1;}
		else if (monthBirth == monthNow && dayBirth > dayNow) {return yearNow - yearBirth - 1;}
		else {return yearNow - yearBirth;}
	}
}
