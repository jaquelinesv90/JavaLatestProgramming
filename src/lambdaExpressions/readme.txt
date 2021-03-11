Lambda

Lambda expression are introduced as a new feature in Java 8.
A lambda expression is an anonymous functions.It's a function without a name and does not belong to any class.

A lambda expression in Java has these main parts.

- No name - as this is anonymous function there is no name needed.
- Parameter list.
- Body - This is the main part of the function.
- No return type - You don't need to mention the return type in lambda's expression.The java 8+ compiler is able
to infer the return type by checking the code.

Lambda is mainly used to implement functional interfaces.Any interface with a SAM(Single Abstract Method) is a
functional interface, and its implementation may be treated as lambda expressions.