# javaee-javamelody-rest-jpa-ejb-monitoring-example

:pushpin: WORK IN PROGRESS :pushpin:

An example Java EE application that demonstrates how to use
[JavaMelody](https://github.com/javamelody/javamelody/) for application
monitoring, including monitoring HTTP requests, SQL queries, EJB calls,
hotspots and other application details.

## The application

The application shows the list of conference speakers and looks like this:

![Screenshot of the app](docs/app.png)

The goal of the project is to demonstrate how to monitor Java EE applications
with JavaMelody and how to configure it properly. To do that, we need a simple
yet realistic application that

- uses Java EE technologies like JAX-RS, JPA and EJB,
- is packaged into an EAR and structured like large Java EE applications in
  accordance with best practices.

The project consists of a web application WAR module that uses services that
are implemented as EJBs in a separate EJB JAR module. The whole application is
packaged into an EAR.

We use [Vue.js](https://vuejs.org/) and [Vue Material](https://vuematerial.github.io/)
for the frontend.

Here's how the EAR looks:

    application-ear.ear
    ├── web-application.war
    ├── service-ejb-impl.jar
    ├── lib
    │   ├── service-ejb-api.jar
    │   ├── javamelody-core.jar
    │   └── jrobin.jar
    └── META-INF
        ├── MANIFEST.MF
        └── application.xml

It’s a Maven project with the following modules:

- *web-application* – JAX-RS application that uses the EJB services, open
  <http://localhost:8080/conference-speakers/> to access it
- *service-ejb-api* – service interface with `@Local` annotation
- *service-ejb-impl* – `@Stateless` EJB that implements the service interface
  and uses DeltaSpike for data access
- *application-ear* – packages the EJB JAR into an EAR.

Build it with `mvn package` and deploy
`application-ear/target/application-ear.ear` to the application server to run
it.

You will see `Failed to define class net.bull.javamelody.[...]`, these are
caused by JavaMelody plugins for various frameworks and are harmless.

## Monitoring

You can access the JavaMelody monitoring console at
<http://localhost:8080/web-application/monitoring>.

Besides the common [machine load charts](https://github.com/javamelody/javamelody/wiki/Screenshots#charts) and
[HTTP requests statistics](https://github.com/javamelody/javamelody/wiki/Screenshots#statistics-of-requests),
the following advanced statistics are available:

### SQL queries statistics

![Screenshot of SQL queries statistics](docs/sql-statistics.png)

### EJB calls statistics

![Screenshot of EJB calls statistics](docs/ejb-statistics.png)

### Hotspots

![Screenshot of hotspots](docs/hotspots.png)

## Adding JavaMelody support to EAR-based applications

See :pushpin:!!sha of commit!!:pushpin: to see what changes are required to
enable JavaMelody.
