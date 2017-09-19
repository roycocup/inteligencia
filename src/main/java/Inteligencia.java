import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import utils.Parameters;

public class Inteligencia {

    private String url;

    public static void main(String[] args) {

    }

    public String getUrl()
    {
        return this.url;
    }

    public void setUrl(Parameters source)
    {
        switch (source)
        {
            case SOURCE_GOOGLE:
                url = "http://google.co.uk";
                break;
            case SOURCE_BING:
                url = "http://bing.com";
                break;
            case SOURCE_DUCK:
            default:
                url = "http://duckduckgo.com";
                break;
        }


    }


    public void ksjhdf()
    {
        try{
            Document document = Jsoup.connect(this.url).get();
        } catch (Exception e){

        }
    }
}
