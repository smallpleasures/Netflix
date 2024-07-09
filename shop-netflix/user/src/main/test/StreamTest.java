import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.codehaus.jettison.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1
 *
 * @author zhanglun
 * @since 2024-07-09
 */
@Slf4j
public class StreamTest {

    @Data
    static class User {
        private String name;
    }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        List<String> result = list.stream().map(User::getName).collect(Collectors.toList());
        log.info(result.toString());
    }
}
