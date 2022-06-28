package got.java.dev6.module13;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Objects;

public class HttpClient {
    public static void main(String[] args) {
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(5000)
                .setConnectTimeout(5000)
                .setSocketTimeout(5000)
                .build();

        String name = "oleksandr";
        HttpGet request = new HttpGet(String.format("https://api.agify.io/?name=%s", name));

        try(CloseableHttpClient client = HttpClientBuilder.create()
                .setDefaultRequestConfig(requestConfig)
                .build();
            CloseableHttpResponse response = client.execute(request))
        {
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            String entityAsString = "";
            if (Objects.nonNull(entity)) {
                entityAsString = EntityUtils.toString(entity);
            }
            System.out.println(entityAsString);
            Gson gson = new Gson();
            User user = gson.fromJson(entityAsString, User.class);
            System.out.println(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
