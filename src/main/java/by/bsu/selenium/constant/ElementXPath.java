package by.bsu.selenium.constant;


public final class ElementXPath {
    public static final String SIGN_IN_BUTTON = "//button[@type='submit']";
    //*[@id="root"]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/form/div[4]/button[1]

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

    private ElementXPath(){}
}
