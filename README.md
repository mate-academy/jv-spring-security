# Spring security

1. Configure Spring Security with in memory authentication.
1. Replace all `?userId` @RequestParam in your code with Authentication object.
1. Add @NonNull, @Min, etc annotations where applicable
   (add [this dependency](https://mvnrepository.com/artifact/org.hibernate/hibernate-validator)
   to your project, see example [here](https://hibernate.org/validator/))
1. Implement custom email validation.
1. Implement CustomGlobalExceptionHandler.
1. Remove method `login()` in AuthenticationService, `HashUtil` and `salt` from User entity.
   Start using `passwordEncoder` in UserService -> add() for password hashing.

__You can check yourself using this__ [checklist](https://mate-academy.github.io/jv-program-common-mistakes/java-spring/security/jv-spring-security-checklist)
