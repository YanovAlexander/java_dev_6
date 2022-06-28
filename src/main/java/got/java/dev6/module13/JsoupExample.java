package got.java.dev6.module13;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsoupExample {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://jsonplaceholder.typicode.com/users/1/posts/?id=10")
                .ignoreContentType(true)
                .get();
        String text = document.body().text();

        Type postListType = new TypeToken<List<Post>>(){}.getType();

        Gson gson = new Gson();
        List<Post> posts = gson.fromJson(text, postListType);

        System.out.println(posts);
    }
}
