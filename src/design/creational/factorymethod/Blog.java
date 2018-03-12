package design.creational.factorymethod;


public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new PostPage());
        pages.add(new ContactPage());
    }
}
