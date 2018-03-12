package design.creational.factorymethod;

public class WebsiteFactory {

    public static Website getWebSite(SiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}

class FactoryClient {

    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebSite(SiteType.BLOG);
        System.out.println(website.getPages());
        website = WebsiteFactory.getWebSite(SiteType.SHOP);
        System.out.println(website.getPages());
    }
}
