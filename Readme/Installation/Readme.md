# INSTALLATION


## Installing Homebrew
1. Go to /usr then:
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
==> Enter password
```

2. Next steps:
Run these three commands in your terminal to add Homebrew to your PATH:
```
  echo '# Set PATH, MANPATH, etc., for Homebrew.' >> /Users/kushal/.zprofile
  echo 'eval "$(/opt/homebrew/bin/brew shellenv)"' >> /Users/kushal/.zprofile
  eval "$(/opt/homebrew/bin/brew shellenv)"
```
Check brew version:
```
brew -v
```

## Installing Maven
Prerequisite: 
Verify Java is installed: 
```
java -version
```
Verify JDK is installed: 
```
javac -version
```
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


## Installing Gradle
Prerequisite:
Verify Java is installed:
```
java -version
```
Verify JDK is installed:
```
javac -version
```
Brew is installed:
```
brew -v
```
1. Go to download link:
   Gradle Download -
   https://gradle.org/install/

