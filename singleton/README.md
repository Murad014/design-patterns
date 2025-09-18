Singleton Design Pattern.

What's Singleton Design Pattern?
The Singleton Design Pattern ensures that only one instance of a class exists during the lifetime of an application. For example, when working with databases, we usually need a single shared connection instance rather than creating multiple ones. Having multiple configuration objects for the same database is not a good practice, since there is only one database to interact with.

The Singleton pattern solves this problem by restricting the instantiation of a class to a single object in the heap and providing a global point of access to it.

There are many kinds of Singleton.

    1. Eager
    2. Lazy
    3. Initialization
    4. Enum

Eager - In Eager Singleton, a static final instance is created at the time of class loading. The JVM initializes this instance when the class is loaded.

Lazy - In Lazy Singleton, the instance is not needed until is need. This approach saves memory but requires carefull implementation to ensure thread safety.
