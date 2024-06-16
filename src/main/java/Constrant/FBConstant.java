package Constrant;

public interface FBConstant {
    public static final String FACEBOOK_CLIENT_ID = "1710158906058386";
    public static final String FACEBOOK_CLIENT_SECRET = "9f76f9a20e4c9bf31e455b6c5b1303f3";
    public static final String FACEBOOK_REDIRECT_URI = "http://localhost:8080/callback";
    public static final String FACEBOOK_LINK_GET_TOKEN="https://www.facebook.com/v20.0/dialog/oauth/access_token";
    public static final String FACEBOOK_LINK_GET_USER_INFO = "https://graph.facebook.com/me?fields=id,name,email,picture&access_token=";
}
