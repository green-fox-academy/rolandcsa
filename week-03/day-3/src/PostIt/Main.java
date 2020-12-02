package PostIt;

public class Main {
    public static void main(String[] args) {
        PostIt idea1 = new PostIt();
        PostIt awesome = new PostIt();
        PostIt superb = new PostIt();

        idea1.backgroundColor = "orange";
        idea1.text = "Idea 1";
        idea1.textColor = "blue";
        awesome.backgroundColor = "pink";
        awesome.text = "Awesome!";
        awesome.textColor = "black";
        superb.backgroundColor = "yellow";
        superb.text = "Superb!";
        superb.textColor = "green";
    }
}
