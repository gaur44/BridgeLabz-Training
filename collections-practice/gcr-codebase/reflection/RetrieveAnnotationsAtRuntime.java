import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Apply annotation to class
@Author(name = "Author Name")
public class RetrieveAnnotationsAtRuntime {

    public static void main(String[] args) {

        // Get Class object
        Class<?> cls = RetrieveAnnotationsAtRuntime.class;

        // Get annotation
        Author author = cls.getAnnotation(Author.class);

        if (author != null) {
            System.out.println("Author Name: " + author.name());
        }
    }
}
