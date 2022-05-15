package utils;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigReaderUtil {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String BETSSON_URL = readConfig().getString("webAddresses.betssonUrl");
    String USER_NAME = readConfig().getString("userData.userName");
    String PASSWORD = readConfig().getString("userData.password");
}
