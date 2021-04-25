package com.company.devansh;
        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import org.jsoup.nodes.Element;
        import org.jsoup.select.Elements;

        import java.io.IOException;

public class WEB_SCRAP_TRY1
{
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://scrapethissite.com/pages/").get();
        System.out.println(doc.title());
        Elements body = doc.select("div.col-md-6.col-md-offset-3");
        //Elements type = doc.select("div.filter-list a div.selected");
        for(Element e : doc.select("div.page")){
            String head = e.select("h3 a").text();
            System.out.println(head);

            String Content = e.select("p").text();
            System.out.println(Content);

            System.out.println();
            System.out.println();

        }


        String try1 = body.select("h1").text();
        System.out.println(try1);
    }
}

