package org.example.week8.task1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface UserPermission {
    String value();
}
