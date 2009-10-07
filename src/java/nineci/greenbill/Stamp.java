package nineci.greenbill;

import org.codehaus.groovy.transform.GroovyASTTransformationClass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

/**
 * Annotation used for gorm domain classes that should have the following proerties
 *  createdBy/createdDate/editedBy/editedDate and default id mapping as well as table name pluralization
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@GroovyASTTransformationClass("nineci.greenbill.StampASTTransformation")
public @interface Stamp {
}
