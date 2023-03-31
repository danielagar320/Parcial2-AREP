package org.example;

import java.util.ArrayList;

import static spark.Spark.*;

public class SparkWebServer {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "http://";

    public static void main(String... args){
        port(getPort());

        staticFiles.location("/front");


        get("/collatz", (req, res ) -> {
            String s = req.queryParams("value");
            return json(Integer.parseInt(s));
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String json(int n) {
        return "{ \"operation\" : \"collatzsequence\", \n" +
                " \"input\" : " + n + ", \n" +
                " \"output\" : \"" + conjetura(n) + "\" \n" +
                "}";
    }

    private static ArrayList<Integer> conjetura(int n) {
        ArrayList<Integer> solucion = new ArrayList<>();
        solucion.add(n);
        if(n % 2 == 0 ){
            n = n/2;
        }else{
            n = n*3 +1;
        }
        solucion.add(n);
        return solucion;
    }




}





