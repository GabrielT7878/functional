package br.edu.mg.unifal.service;

import br.edu.mg.unifal.domain.User;
import br.edu.mg.unifal.enumerator.Gender;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.UUID;
import java.util.function.*;

@NoArgsConstructor
public class UserService {

    /*
     *  PREDICATE
     *  Represents a predicate (boolean-valued function) of one argument.
     *  Example: Verify if the user is male
     */

    // Using traditional Java
    public boolean isMale(User user) {
        return Gender.MALE.equals(user.getGender());
    }
    // Using Predicate (Java 8)
    public Predicate<User> isMale = user -> Gender.MALE.equals(user.getGender());

    public Predicate<User> isPreferNotSay = user -> Gender.PREFER_NOT_SAY.equals(user.getGender());



    /* ------------------------------------ ## ------------------------------------ */

    /*
     *  CONSUMER
     *  Represents an operation that accepts a single input argument and returns no result.
     *  Unlike most other functional interfaces, Consumer is expected to operate via side effects.
     *  Example: Print the information of a user
     */

    // Using traditional Java

    // Using Consumer (Java 8)

    public Consumer<User> printUser = user -> System.out.println(user.toString());


    /* ------------------------------------ ## ------------------------------------ */

    /*
     *  SUPPLIER
     *  Represents a supplier of results.
     *  There is no requirement that a new or distinct result be returned each time the supplier is invoked.
     *  Example: Implement a method that provides a random uuid
     */

    // Using traditional Java

    // Using Supplier (Java 8)
    
    
    public Supplier<UUID> getUUID = UUID::randomUUID;
    public Supplier<LocalDate> getDate = LocalDate::now;
    
    
    
    


    /* ------------------------------------ ## ------------------------------------ */

    /*
     *  FUNCTION
     *  Represents a function that accepts one argument and produces a result.
     *  Example: Implement a method that calculates the age of the user
     */

    // Using traditional Java

    // Using Function (Java 8)

    public Function<User,Integer> getUserAge = user -> Period.between(user.getBirthdate().toLocalDate(),LocalDate.now()).getYears();
    /* ------------------------------------ ## ------------------------------------ */

    /*
     *  STREAM
     *  A sequence of elements supporting sequential and parallel aggregate operations.
     *  It supports methods such as: forEach, filter, and map.
     *
     *  forEach:
     *      void forEach(Consumer<? super T> action)
     *      Performs an action for each element of this stream.
     *
     *  filter:
     *      filter(Predicate<? super T> predicate)
     *      Returns a stream consisting of the elements of this stream that match the given predicate.
     *
     *  map:
     *      map(Function<? super T,? extends R> mapper)
     *      Returns a stream consisting of the results of applying the given function to the elements of this stream.
     *
     * Example: Implement three methods that:
     *  1. Prints the information of the users from a list
     *  2. Returns a list with female users
     *  3. Returns a list with the age of all users
     */

    // Using traditional Java

    // Using Stream (Java 8)


    /* ------------------------------------ ## ------------------------------------ */

}
