
package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)  @interface Bilgi 
{
    String bilgi();
    String tarih();
    String yazar();
}
 
@Bilgi(bilgi = "main class", tarih = "14.07.2012", yazar = "Kazım")
@SuppressWarnings(value = { "" })
public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {

        //Main sınıfının bütün annotationlarını alır
        Annotation[] ann =  c.getDeclaredAnnotations();
                 
        for( Annotation a : ann )
        {
    
            System.out.println("Annotation Type:"+annType);
            System.out.println(a.toString());           
        }
         
        Bilgi infoAnn = c.getAnnotation( Bilgi.class );
        System.out.println("Bilgi:"+infoAnn.bilgi());
        System.out.println("Tarih:"+infoAnn.tarih());
        System.out.println("Yazar:"+infoAnn.yazar());           
    }
}