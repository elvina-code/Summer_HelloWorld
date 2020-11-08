package Exercises.StaticAndNonStaticMethod;

public class Book {
    private static String publish;
    private String title;


    public String getTitle(){
        return title;
    }

    public static String getPublish(){
        return publish;
    }

    public static void setPublish(String publish) {
        Book.publish = publish;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
