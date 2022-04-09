package day11;

public class Browser {
    public static void main(String[] args) {

        String browserName = "opera";
        String result = "";

        switch (browserName){
            case "chrome":
                result = "Chrome Browser is Selected";
                break;
            case "firefox":
                result = "FireFox Browser is Selected";
                break;
            case "opera":
                result = "Opera Browser is Selected";
                break;
            case "safari":
                result = "Safari Browser is Selected";
                break;
            case "edge":
                result = "Edge Browser is Selected";
                break;
            default:
                result = "Invalid Browser";
        }
        System.out.println(result);
    }
}
