package org.jboss.as.quickstarts.html5rest.svc;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Random;

@Singleton
public class BeanFactory {


    @Inject
    @Any
    private Instance<BaseBeanImpl> beans;


    public BaseBeanImpl getRandomBeanImpl() {
        int randomInt = new Random().ints(0, 3).findFirst().getAsInt();

        int i = 0;
        for (BaseBeanImpl service : beans) {
            if (i == randomInt) {
                return service;
            }
            i++;
        }
        return null;
    }

}
