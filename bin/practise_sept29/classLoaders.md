ClassLoaders in java:


1. BootStrap classloader:

it loads the rt.jar files  (contains java.util.*, java.lang.*) packages into memory.

2. Extension classLoader:

it loads the extension libraries from the path: <JAVA_HOME>/lib/ext

3. Application classLoader:

Loads the class files from the application classpath, specified by CLASSPATH or -classpath option

4. Custom class loader:

Defined by developers for custom behavior, loads the class files from any location 
such as network, encrypted JAR e.t.c.,