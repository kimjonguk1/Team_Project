package org.example;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            String url = "http://www.cgv.co.kr/movies/";
//            Document document = Jsoup.connect(url).get();
//
//            Elements links = document.select("div.box-image > a");
//
//            System.out.println("HTML 페이지에서 수집한 영화 링크:");
//            for (Element link : links) {
//                String href = link.attr("href");
//                System.out.println("http://www.cgv.co.kr" + href);
//            }
//
//            String apiUrl = "http://www.cgv.co.kr/common/ajax/movies.aspx/GetMovieMoreList?listType=1&orderType=1&filterType=1";
//            Connection.Response response = Jsoup.connect(apiUrl)
//                    .header("Content-Type", "application/json; charset=utf-8")
//                    .header("Accept", "application/json, text/javascript, */*; q=0.01")
//                    .ignoreContentType(true)
//                    .execute();
//
//            JSONObject jsonObject = new JSONObject(response.body());
//            String encodedData = jsonObject.getString("d");
//
//            JSONObject dataObject = new JSONObject(encodedData);
//            JSONArray movieList = dataObject.getJSONArray("List");
//
//            for (int i = 0; i < movieList.length(); i++) {
//                JSONObject movie = movieList.getJSONObject(i);
//                int movieIdx = movie.getInt("MovieIdx");
//
//                String detailUrl = "http://www.cgv.co.kr/movies/detail-view/?midx=" + movieIdx;
//                System.out.println(detailUrl);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
    }