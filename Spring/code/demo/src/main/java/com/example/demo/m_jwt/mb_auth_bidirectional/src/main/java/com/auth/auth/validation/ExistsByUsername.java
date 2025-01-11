package main.java.com.auth.auth.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

// @Constraint indica que esta anotación es una restricción de validación y especifica la clase validadora
@Constraint(validatedBy = ExistsByUsernameValidation.class)
// @Target define dónde se puede aplicar esta anotación, en este caso a campos (ElementType.FIELD)
@Target(ElementType.FIELD)
// @Retention especifica que la anotación estará disponible en tiempo de ejecución
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByUsername {
    // Mensaje de error por defecto si la validación falla
    String message() default "¡Ya existe en la base de datos! ¡Escoja otro nombre de usuario!";

    // Permite especificar grupos de validación a los que pertenece esta restricción
    Class<?>[] groups() default {};

    // Permite adjuntar información de carga útil adicional a la restricción
    Class<? extends Payload>[] payload() default {};
}
