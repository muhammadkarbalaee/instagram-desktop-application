package sample.backend;

import com.google.gson.Gson;
import sample.backend.api.ApiHandler;
import sample.backend.api.Request;
import sample.backend.api.RequestPipeline;

import java.io.IOException;
import java.util.Scanner;

public class ClientBackendTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        Gson gson = new Gson();
        RequestPipeline.build();
        Request request = new Request("GET_COMMENTS_QUANTITY","reyhan/1");
        ApiHandler apiHandler = new ApiHandler(request);
        apiHandler.sendRequest();
        System.out.println(apiHandler.receiveCommentQuantity());
    }
}