//# Blog
//
//        - Reuse your `BlogPost` class
//- Create a `Blog` class which can
//  - store a list of BlogPosts
//          - add BlogPosts to the list
//          - delete(int) one item at given index
//          - update(int, BlogPost) one item at the given index and update it with another
//          BlogPost

package blog;

public class Main {
    public static void main(String[] args) {
        Blog.add();
        System.out.println(Blog.list.size());
        Blog.delete(0);
        System.out.println(Blog.list.size());
        Blog.add();
        Blog.add();
        Blog.add();
        BlogPost blogpost1 = Blog.list.get(0);
        blogpost1.text = "Hello!";
        Blog.delete(0);
        Blog.update(0, blogpost1);
        System.out.println(Blog.list.size());
        System.out.println(Blog.list.get(0).text);

//        Not finished
    }
}
