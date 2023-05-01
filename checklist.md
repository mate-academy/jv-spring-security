## Common mistakes (jv-spring-security)

* Be careful with CustomGlobalExceptionHandler. Let's use `getAllErrors()` instead of `getFieldErrors()`.
* Don't forget to add `SecurityConfig.class` in `MyWebAppInitializer` -> `getRootConfigClasses()`.
* Be careful with `@Target` annotation. Choose correct [ElementType](https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/ElementType.html).
* Add your custom email validation annotation above a field and password annotation above the class.
* Remember about parameterizing interface ConstraintValidator with two parameters.
* Don't override method initialize(), we don't need it in validator class.
* Don't forget to rename parameters in isValid() method.
* Let's create a constant with regex to check email. Remember about [naming](https://mate-academy.github.io/style-guides/java/java.html#s5.2.4-constant-names).
If you use `Pattern` - make it constant too.
* Remember, that `null.equals(smth)` == NPE. HINT: be careful with implementation of the `isValid()` method.
* Don't repeat checks for fields: you must ensure `email` field not to be null in your custom Validator, so there is no need to put `@NotNull` for that field as well in Dto class.
The same goes for the `password` field.
* Be careful with `@Size`, `@Min` and `@Max` annotations. Read javadoc to learn about their correct use.
* Can we use `@NotNull` annotation above the field with primitive data types? Be careful to use only the suitable annotations :)
* Don't create `PasswordEncoder` using `new` keyword. Let's use dependency injection by the constructor.
* Don't change `findByEmail()` method in UserController - this method is supposed to return info about any user.
* Be sure you have the `@Valid` annotation in your controllers for the validation to take effect.
* Your custom constraints should have the obligatory parameters: `group()` and `payload()`.
* For validation use classes from `javax.validation` package.
