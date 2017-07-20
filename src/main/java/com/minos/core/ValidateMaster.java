package com.minos.core;


import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import java.util.List;

public class ValidateMaster {

    private static Validator validator = new Validator();

    public static void validateObject(Object object) throws Exception {

        List<ConstraintViolation> violationList = validator.validate(object);
        for (ConstraintViolation violation : violationList){
            throw new RuntimeException(violation.getMessage());
        }
    }


}
