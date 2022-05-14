package ws.restservlet;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author kshitij
 */
public class EmployeeApplication extends Application {

    private Set<Object> singletons = new HashSet<>();

    public EmployeeApplication() {
        singletons.add(new EmployeeRESTImpl());
    }
    
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
