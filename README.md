### spring-boot-app-engine-standard
Spring boot application deploy-able on Google App Engine Standard

### Background
Spring-boot comes with an embedded server and in order to run in App-Engine Standard environment, the conditions for the environment should be met.
For the same, in this project, precisely in this commit : [2a67970d3](https://github.com/vivekbhatnagar/spring-boot-app-engine-standard/commit/2a67970d3e3103d26a2875b3c796c28d4b950c4a?diff=split)
changes have been made to detach embedded server and attach with app-engine-standard-env specific configurations.

### Pre-requisites / Assumptions
In order to explore and make use of this project, assumptions :
* One have a Google account , i.e. further a Google Cloud account.
* One already have a active project on Google Cloud Platform.
* Local IDE linked to Google Cloud tool/plugin or Cloud SDK installed
* There is no need for billing to be enabled for your app-engine project. (As this standard)

### Guides
The following guides illustrate how to use some features concretely:

* [Google App Engine Standard Environment](https://cloud.google.com/appengine/docs/standard/)
* [Spring-boot-docs](https://spring.io/projects/spring-boot)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Troubleshooting

**_Error:_** Failed to execute goal org.apache.maven.plugins:maven-war-plugin:3.2.3:war (default-war) on project spring-boot-app-engine-standard: Error assembling WAR: webxml attribute is required (or pre-existing WEB-INF/web.xml if executing in update mode)

**_Resolution:_** For google-app-engine project (standard) you have to add **appengine-web.xml** in the aforementioned path. This configure is required for applications running in Google App Engine.

**_Error:_** No plugin found for prefix 'appengine' in the current project and in the plugin groups [org.apache.maven.plugins, org.codehaus.mojo] available from the repositories

**_Resolution:_** app-engine plugin description is missing or wrong in pom.xml.