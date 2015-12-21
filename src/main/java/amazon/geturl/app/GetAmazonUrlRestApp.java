package amazon.geturl.app;

import com.aol.micro.server.MicroserverApp;
import com.aol.micro.server.config.Microserver;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Microserver(basePackages = { "amazon.geturl" }, propertiesName = "application.properties")
public class GetAmazonUrlRestApp {

    public static void main(String[] args) throws InterruptedException {

        new MicroserverApp(() -> "amazon-app").run();
    }
}
