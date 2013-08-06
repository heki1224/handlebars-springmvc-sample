handlebars-springmvc-sample
======================
handlebars-springmvc-sample
Handlebars.javaをSpringMVCで使う場合のサンプルです。  
  
解説(description)
------
#### mvc-config.xml  
HandlebarsViewResolverを設定する事で、SpringMVCでテンプレートを使用する事ができます。  
MessageSourceHelperを設定する事で、テンプレートでメッセージリソースを使用する事ができます。
```xml
	<bean id="templateResolver"
		class="com.github.jknack.handlebars.springmvc.HandlebarsViewResolver">
		<property name="prefix" value="/WEB-INF/templates/" />
		<property name="suffix" value=".hbs" />
		<property name="cache" value="false" />
	</bean>

	<bean id="messageSourceHelper"
		class="com.github.jknack.handlebars.springmvc.MessageSourceHelper">
		<constructor-arg ref="messageSource" />
	</bean>

	<bean id="messageSource"
		class="org.springframework.context.support.ResourceBundleMessageSource">
		<property name="basename" value="messages" />
	</bean>
```

開発環境(development environment)
------------
Eclipse 4.3  
  
依存ライブラリ(dependencies library)
----------------
handlebars 1.1.0
handlebars-springmvc 1.1.0
spring-webmvc 3.2.3
slf4j 1.7.5  
logback 1.0.13  
  
参考(Link)
----------------
http://jknack.github.io/handlebars.java/  
https://github.com/jknack/handlebars.java  
