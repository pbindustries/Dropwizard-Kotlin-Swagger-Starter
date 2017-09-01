package helloworld

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import helloworld.resources.HelloWorldResource
import helloworld.health.TemplateHealthCheck

//////////////////////////////////////// IN DEVELOPMENT /////////////////////////////////
//import io.dropwizard.setup.Bootstrap
//import helloworld.resources.HelloWorldConfiguration
//import io.dropwizard.Bundle
//import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration
//import io.federecio.dropwizard.swagger.SwaggerBundle



class HelloWorldApplication() : Application<HelloWorldConfiguration>() {


/////////////////////////////////////// IN DEVELOPMENT /////////////////////////
//    override fun initialize(bootstrap: SwaggerBundle<HelloWorldConfiguration>) {
//        bootstrap.addBundle(SwaggerBundle: SwaggerBundle<HelloWorldConfiguration>() {
//            fun getSwaggerBundleConfiguration(configuration: HelloWorldConfiguration): SwaggerBundleConfiguration {
//                return configuration.HelloWorldConfiguration
//            }
//        })
//    }


    override fun run(config: HelloWorldConfiguration, env: Environment) {
        val resource =  HelloWorldResource(config.template, config.defaultName)
        val healthCheck = TemplateHealthCheck(config.template)

        env.healthChecks().register("template", healthCheck)
        env.jersey().register(resource)
    }

}