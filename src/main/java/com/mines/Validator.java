package com.mines;


import com.mines.core.ValidateMaster;
import com.mines.core.exception.ParameterValidateException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Validator {

    @Before(value = "@annotation(com.mines.core.annotations.Validator)")
    public void validate(JoinPoint point){
        Signature signature = point.getSignature();
        Object[] args = point.getArgs();

        for (int i = 0; i < args.length ; i++) {
            try {
                ValidateMaster.validateObject(args[i]);
            }catch (Exception e){
                throw new ParameterValidateException(e.getMessage());
            }
        }
    }


}
