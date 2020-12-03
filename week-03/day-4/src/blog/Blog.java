package blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    public static List<BlogPost> list = new ArrayList<>();

    public static void add() {
        list.add(new BlogPost());
    }

    public static void delete(int index) {
        list.remove(index);
    }

    public static void update(int number, BlogPost updatedPost) {
        list.set(number, updatedPost);
    }
}
