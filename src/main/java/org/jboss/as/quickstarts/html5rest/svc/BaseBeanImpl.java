package org.jboss.as.quickstarts.html5rest.svc;

import javax.ejb.Stateless;

@Stateless
public class BaseBeanImpl implements BeanInterface {

    @Override
    public String doSomething() {
        return "BaseBeanImpl";
    }
}
