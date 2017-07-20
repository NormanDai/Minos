package com.minos;


import com.minos.core.annotations.Validator;
import net.sf.oval.constraint.NotEmpty;

public class BeanTest {

    @NotEmpty
    private String userName;

    @Validator
    public String test(BeanTest beanTest){
        return "";
    }

}
