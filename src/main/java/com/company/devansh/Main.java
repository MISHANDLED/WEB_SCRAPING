package com.company.devansh;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main
{
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("http://openinsider.com/latest-cluster-buys").userAgent("USER_AGENT_HERE").get();
        //System.out.println(doc.outerHtml());
        Elements body = doc.select("table.tinytable ");

        WritingToCSV writers = new WritingToCSV();

        for(Element head : body.select("thead tr")){
                String Name1 = head.select("th:nth-of-type(2) h3").text();
                String Name2 = head.select("th:nth-of-type(3) h3").text();
                String Name3 = head.select("th:nth-of-type(4) h3").text();
                String Name4 = head.select("th:nth-of-type(5) h3").text();
                String Name5 = head.select("th:nth-of-type(6) h3").text();
                String Name6 = head.select("th:nth-of-type(9) h3").text();
                String Name7 = head.select("th:nth-of-type(10) h3").text();
                String Name8 = head.select("th:nth-of-type(11) h3").text();
                String Name9 = head.select("th:nth-of-type(12) h3").text();
                String Name10 = head.select("th:nth-of-type(13) h3").text();

                String[] names = {Name1,Name2,Name3,Name4,Name5,Name6,Name7,Name8,Name9,Name10};
                writers.write(names);
                System.out.println();

        }

        for(Element row : body.select("tbody tr")){
            String Filing_Date = row.select("td:nth-of-type(2) div a").text();
            //System.out.println(Filing_Date);

            String Trade_Date = row.select("td:nth-of-type(3) div").text();
            //System.out.println(Trade_Date);

            String Ticker = row.select("td:nth-of-type(4) b a").text();
            //System.out.println(Ticker);

            String Company_Name = row.select("td:nth-of-type(5) a").text();
            //System.out.println(Company_Name);

            String Industry_Type = row.select("td:nth-of-type(6) a").text();
            //System.out.println(Industry_Type);

            String Price = row.select("td:nth-of-type(9)").text();
            //System.out.println(Price);

            String Quantity = row.select("td:nth-of-type(10)").text();
            //System.out.println(Quantity);

            String Owned = row.select("td:nth-of-type(11)").text();
            //System.out.println(Owned);

            String Owned_Percentage = row.select("td:nth-of-type(12)").text();
            //System.out.println(Owned_Percentage);

            String Value = row.select("td:nth-of-type(13)").text();
            //System.out.println(Value);

            String[] line1 = {Filing_Date, Trade_Date, Ticker, Company_Name, Industry_Type, Price, Quantity, Owned, Owned_Percentage, Value};
            writers.write(line1);
            System.out.println();
        }

        }
    }



