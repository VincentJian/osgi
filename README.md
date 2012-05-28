How to run
1. Import all projects in Eclipse
2. In Eclipse, Window -> Preference -> Plug-in Development -> Target Platform
3. Add an empty target definiation and specify directory to plugin_respority
4. Right click on any project -> Run As -> Run Configuration -> OSGi Framework
5. Uncheck the following bundles that are not required here and click Run button.
   a) com.springsource.com.mysql.jdbc
   b) com.springsource.org.hsqldb
   c) org.eclipse.virgo.web.dm
   d) org.springframework.osgi.test
   e) org.springframework.test
6. Visit http://localhost:8080/zkspringosgi/index.zul to see the result.