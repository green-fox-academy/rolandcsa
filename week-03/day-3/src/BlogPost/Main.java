package BlogPost;

public class Main {
    public static void main(String[] args) {
        BlogPost loremIpsum = new BlogPost();
        BlogPost waitButWhy = new BlogPost();
        BlogPost engineer = new BlogPost();

        loremIpsum.authorName = "John Doe";
        loremIpsum.title = "Lorem Ipsum";
        loremIpsum.text = "Lorem ipsum dolor sit amet.";
        loremIpsum.publicationDate = "2000.05.04.";

        waitButWhy.authorName = "Tim Urban";
        waitButWhy.title = "Wait but why";
        waitButWhy.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        waitButWhy.publicationDate = "2010.10.10.";

        engineer.authorName = "William Turton";
        engineer.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        engineer.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        engineer.publicationDate = "2017.03.28.";
    }
}
