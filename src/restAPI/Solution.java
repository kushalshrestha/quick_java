///*
// * Copyright (c) 2023.
// * Author : Kushal Shrestha
// * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
// * Email : kushalshr@gmail.com
// */
//
//package restAPI;
//
//import org.json.JSONArray;
//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Article {
//    String title;
//    String storyTitle;
//    int numComments;
//
//    Article(String title, String storyTitle, int numComments) {
//        this.title = title;
//        this.storyTitle = storyTitle;
//        this.numComments = numComments;
//    }
//
//    String getTitleToSort() {
//        if (title != null) {
//            return title;
//        } else if (storyTitle != null) {
//            return storyTitle;
//        } else {
//            return null;
//        }
//    }
//}
//
//public class Solution {
//
//    static List<String> topArticles(int limit) {
//        String baseUrl = "https://jsonmock.hackerrank.com/api/articles?page=";
//        int pageNumber = 1;
//        List<Article> articles = new ArrayList<>();
//
//        while (true) {
//            try {
//                String apiUrl = baseUrl + pageNumber;
//                URL url = new URL(apiUrl);
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setRequestMethod("GET");
//
//                int responseCode = connection.getResponseCode();
//                if (responseCode == HttpURLConnection.HTTP_OK) {
//                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                    String inputLine;
//                    StringBuilder response = new StringBuilder();
//
//                    while ((inputLine = in.readLine()) != null) {
//                        response.append(inputLine);
//                    }
//                    in.close();
//
//                    JSONObject jsonResponse = new JSONObject(response.toString());
//                    JSONArray articleArray = jsonResponse.getJSONArray("data");
//
//                    for (int i = 0; i < articleArray.length(); i++) {
//                        JSONObject articleJson = articleArray.getJSONObject(i);
//                        String title = articleJson.optString("title", null);
//                        String storyTitle = articleJson.optString("story_title", null);
//                        int numComments = articleJson.optInt("num_comments", 0);
//                        articles.add(new Article(title, storyTitle, numComments));
//                    }
//
//                    // Check if there are more pages to fetch
//                    int totalPages = jsonResponse.getInt("total_pages");
//                    if (pageNumber >= totalPages) {
//                        break;
//                    }
//                    pageNumber++;
//                } else {
//                    // Handle error response
//                    System.out.println("Error response: " + responseCode);
//                    break;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                break;
//            }
//        }
//
//        List<String> result = articles.stream()
//                                      .sorted(Comparator
//                                                      .comparing(Article::getTitleToSort, Comparator.nullsLast(Comparator.reverseOrder()))
//                                                      .thenComparing(Article::numComments, Comparator.reverseOrder())
//                                      )
//                                      .limit(limit)
//                                      .map(article -> article.getTitleToSort())
//                                      .collect(Collectors.toList());
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int limit = 2;
//        List<String> topArticles = topArticles(limit);
//        topArticles.forEach(System.out::println);
//    }
//}
//
