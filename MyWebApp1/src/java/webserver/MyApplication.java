package webserver;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author kshitij
 */
public class MyApplication extends Application {

    private Set<Object> singletons = new HashSet<>();

    public MyApplication() {
        singletons.add(new MyRestAPIConfig());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
