# What's new in version 2.2

## Introduction

In the next sections, you will get a synthesis of the major changes done
to the Restlet Framework in version 2.2.

For more details, you can read the [2.2 announce on our blog](http://blog.restlet.com/2014/03/26/restlet-framework-2-2-0-and-2-3-m1-released)
as well as [the full list of changes](http://restlet.org/learn/2.2/changes).

## Main changes

 - Java 6 requirement
 - Apache License 2.0 option
 - Jackson extension now supports JSON, JSON binary (Smile), XML, YAML and CSV formats
 - Internal HTTP client and server now based on stable JDK Net classes
   - reduced size of org.restlet.jar of about 20Kb
   - best default HTTP client on Android
   - moved previous internal connector to new NIO extension (preview)
 - New Swagger extension (only JAX-RS API support for now)
 - New Thymeleaf templating extension
 - New GSON extension, supporting Google’s JSON serialization library
 - OAuth 2.0 final RFC (preview)
   - added client support for HTTP OAuth MAC authentication
 - HTTP PATCH method support
 - Javadocs artefacts added to Maven repository
 - Annotation based JAX-RS client (not compliant with JAX-RS 2.0)
 - JSONP filter to workaround single origin policies in browsers
 - Converter exceptions are now properly transmitted
 - OSGi extension support RESTful inter-bundle communication
 - Updated over 25 dependencies (Jackson, Jetty, Apache, MongoDB, etc.)
 - Forge migration to GitHub
 - User questions migration to StackOverflow
 - Easier contribution as modules are now regular Eclipse projects (not PDE plugins)
 - Many bug fixes

## Migration guide from version 2.1 to 2.2

This section intends to explain the main differences between the Restlet
2.1 and 2.2 releases and to help you migrate your existing applications.
Both releases are meant to be compatible at the API level, so you should
at most observe deprecate features while upgrading.

Note that if you intend to migrate directly from 1.1 to 2.2, you should
really consider migrating first from 1.1 to 2.0 and then from 2.0 to
2.2. For migration instructions between 1.1 and 2.0, you can check [this
page](../../../2.0/introduction/whats-new/migration "Migration guide from version 1.1 to 2.0").

### Replace all JAR files

Restlet JARs and dependencies

### Deprecated API features

The next step is to look at each deprecated feature and look in the
Javadocs at the preferred alternative in version 2.2.