package com.bt.btbackend.validation.annotation;

import com.bt.btbackend.validation.validator.IsDateValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
// Note: We use here already a validator which we will add in a sec too
@Constraint(validatedBy = IsDateValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsDate {
    // used to get later in the resource bundle the i18n text
    String message() default "{validation.date.IsDate.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}