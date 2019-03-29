package i3regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("g{3}");
		Matcher matcher = pattern.matcher("sgggjt");
		
		System.out.println(matcher.matches());
		System.out.println(matcher.find());
		System.out.println(Pattern.matches("[a-z]{3}", "bla"));
		
		System.out.println("----------------");
		String str = "lorem ipsum dolor sit amet";
		pattern = Pattern.compile("o");
		matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(str.substring(0, matcher.end()) + "--|--" + str.substring(matcher.start()));
		}
		
		System.out.println("----------------");
		System.out.println(str);
		pattern = Pattern.compile(".o.");
		matcher = pattern.matcher(str);
		while (matcher.find()) {System.out.println(matcher.group());}
		
		System.out.println("----------------");
		matcher.reset();
		if (matcher.find())System.out.println(matcher.group());
		pattern = Pattern.compile(".u.");
		matcher.usePattern(pattern);
		if (matcher.find())System.out.println(matcher.group());
		
		System.out.println("----------------");
		pattern = Pattern.compile("l.+m");
		matcher = pattern.matcher(str);
		while (matcher.find()) {System.out.println(matcher.group());}

		System.out.println("----------------?");
		pattern = Pattern.compile("l.+?m");
		matcher = pattern.matcher(str);
		while (matcher.find()) {System.out.println(matcher.group());}

		System.out.println("----------------+");
		pattern = Pattern.compile("l.++m");
		matcher = pattern.matcher(str);
		while (matcher.find()) {System.out.println(matcher.group());}
		
	}

}
