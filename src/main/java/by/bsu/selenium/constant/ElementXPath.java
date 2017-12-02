package by.bsu.selenium.constant;


public final class ElementXPath {
    public static final String BUTTON = "//button[@type='submit']";

    public static final String ERROR_SIGN_IN_MESSAGE = "//*[@id=\"root\"]/div/div[2]/div[1]/div[1]";

    public static final String USER_NAME = "//*[@id=\"root\"]/div/div[4]/div/div[1]/div/div[1]/div[1]";
    public static final String LOGIN_NAME = "//*[@id=\"root\"]/div/div[4]/div/div[1]/div/div[1]/div[2]";

    public static final String PROFILE_MAIN_BUTTON = "//*[@id=\"root\"]/div/div[2]/div[3]/div/a[1]";
    public static final String PROFIlE_PURCHASES_BUTTON = "//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/a[2]";
    public static final String PROFILE_FAVORITES_BUTTON = "//*[@id=\"root\"]/div/div[2]/div[3]/div/a[3]";


    public static final String FAVORITES_VIDEOS = "//div[contains(@class, 'video')]/div[1]/a[2]";
    public static final String FAVORITES_COLLECTIONS = "//div[contains(@class, 'collections')]/div[1]/a[2]";
    public static final String FAVORITES_POSTERS = "//div[contains(@class, 'afisha')]/div[1]/a[2]";
    public static final String FAVORITES_MARKET = "//div[contains(@class, 'market')]/div[1]/a[2]";

    public static final String MY_POSTERS = "//div[contains(@class, 'afisha-card__item')]";
    public static final String MY_POSTERS_NAME = "//div[contains(@class, 'afisha-card__title')]/a";


    public static final String POSTERS_ON_PAGE = "//div[contains(@class, 'events-feed content-rubric-selections__events')]/div[2]";
    public static final String POSTER = "//div[contains(@class, 'events-list__item')]";
    public static final String POSTER_TITLE = "//h2[contains(@class,'event__name')]";
    public static final String BOOKMARK = "//span[contains(@class, 'bookmark')]";
    public static final String BOOKMARK_ACTIVE = "//span[contains(@class, 'bookmark_active_yes')]";



    private ElementXPath(){}
}
