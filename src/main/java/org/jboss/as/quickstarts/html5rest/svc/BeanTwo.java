package org.jboss.as.quickstarts.html5rest.svc;

import javax.ejb.Stateless;

@Stateless
public class BeanTwo extends BaseBeanImpl {


    @Override
    public String doSomething() {
        return this.getClass().getCanonicalName();
    }
}
