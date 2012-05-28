How to run
- Import all projects in Eclipse
- In Eclipse, Window -> Preference -> Plug-in Development -> Target Platform
- Add an empty target definiation and specify directory to plugin_respority
- Right click on any project -> Run As -> Run Configuration -> OSGi Framework
- Uncheck the following bundles that are not required here and click Run button.
   * com.springsource.com.mysql.jdbc
   * com.springsource.org.hsqldb
   * org.eclipse.virgo.web.dm
   * org.springframework.osgi.test
   * org.springframework.test
- Visit http://localhost:8080/zkspringosgi/index.zul to see the result.