/**
 * un programme d'essais
 */
package e3TryCatchAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yh
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value = YHAnn.class)
@interface YHAnnotation{
	String str() default "defaut string dans annotation, à changer";
	int val() default -1;
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface YHAnn{
	YHAnnotation[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface YHDescr {
	String descr() default "no description, à ajouter";
}

@Retention(RetentionPolicy.RUNTIME)
@interface YHDescr2 {
	String descr() default "no description, à ajouter";
}

@Retention(RetentionPolicy.RUNTIME)
@interface UnMarker {}

@Retention(RetentionPolicy.RUNTIME)
@interface Annot1 {
	String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Annot2 {
	String value() default "Annot2, no description, à ajouter";
}

@Retention(RetentionPolicy.RUNTIME)
@interface Annot3 {
	String str() default "Annot2, no description, à ajouter";
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Annot4 {
	String str() default "Annot2, no description, à ajouter";
	int value();
}