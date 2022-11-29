# java-maven-package
测试发布jar包到github的流程

# [站点地址](https://lijianguo1211.github.io/java-maven-package)

```shell
https://lijianguo1211.github.io/java-maven-package
```

# [jar包下载](https://lijianguo1211.github.io/java-maven-package/maven-repo/xyz/lglg/packageMvn/java-maven-package/1.0-SNAPSHOT/java-maven-package-1.0-20221129.034358-1.jar)

```shell
https://lijianguo1211.github.io/java-maven-package/maven-repo/xyz/lglg/packageMvn/java-maven-package/1.0-SNAPSHOT/java-maven-package-1.0-20221129.034358-1.jar
```

## 以github为仓库使用

```xml
<repositories>
    <repository>
        <id>github-rich-repo</id>
        <name>The Maven Repository on Github</name>
        <url>https://lijianguo1211.github.io/java-maven-package/maven-repo/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>xyz.lglg.packageMvn</groupId>
        <artifactId>java-maven-package</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```