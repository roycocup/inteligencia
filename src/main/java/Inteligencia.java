import utils.Cacher;
import utils.DataFetcher;

public class Inteligencia {

    public final DataFetcher dataFetcher;
    public final Cacher cacher;

    public static void main(String[] args) {
        Inteligencia i = new Inteligencia();
    }

    public Inteligencia()
    {
        this.dataFetcher = new DataFetcher();
        this.cacher = new Cacher();
    }
}




//        String data = i.goGetData();
//        try{
//            FileWriter fstream = new FileWriter("out.txt");
//            BufferedWriter out = new BufferedWriter(fstream);
//            out.write(data);
//            out.close();
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }


//test
//        String data = main.goGetData();
//
//        try {
//            new JSONObject(data);
//        } catch (JSONException ex) {
//            try {
//                new JSONArray(data);
//            } catch (JSONException ex1) {
//                System.out.println(ex1.toString());
//            }
//            System.out.println(ex.toString());
//        }
//        assertTrue(true);



//switch (source)
//        {
//        case SOURCE_GOOGLE:
//        url = "http://google.co.uk";
//        break;
//        case SOURCE_BING:
//        url = "http://bing.com";
//        break;
//        case SOURCE_DUCK:
//default:
//        url = "http://api.duckduckgo.com/?q=ernest&format=json";
//        break;
//        }


//public String goGetData() {
//        String data = "";
//        try{
//        URL url = new URL(this.url);
//        URLConnection conn = url.openConnection();
//        conn.setAllowUserInteraction(false);
//        conn.setDoOutput(true);
//        conn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
//        InputStream is = conn.getInputStream();
//        data = new BufferedReader(new InputStreamReader(is))
//        .lines().collect(Collectors.joining("\n"));
//        } catch (Exception e){
//        System.out.println(this.url);
//        System.out.println(e.getMessage());
//        }
//
//        return data;
//        }