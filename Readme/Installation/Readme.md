# INSTALLATION


## Installing Maven
1. check if JAVA_HOME is defined in your MAC OS + M1 chip
```
echo $JAVA_HOME
Eg: /Library/Java/JavaVirtualMachines/jdk-19.jdk/Contents/Home
```
2. Download Maven from - https://maven.apache.org/install.html

Latest Binary tar.gz archive - apache-maven-3.8.7-bin.tar.gz
move this tar.gz to /opt

``
sudo mv apache-maven-3.8.7-bin.tar.gz /opt
``

3. Extract file
Go to /opt folder and extract using the following command:
```
sudo tar xzvf apache-maven-3.8.7-bin.tar.gz
```

4. Add apache mvn to path

```agsl
export PATH=/opt/apache-maven-3.8.7/bin:$PATH
mvn
```

5. Check maven version

```agsl
mvn -v
```