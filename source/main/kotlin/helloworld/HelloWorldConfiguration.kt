package helloworld

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

//////////////////////////////////////// IN DEVELOPMENT /////////////////////////////////
//import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration



public class HelloWorldConfiguration() : Configuration() {
    @JsonProperty("template")
    var template: String=""

    @JsonProperty("defaultName")
    var defaultName: String="Stranger"

//////////////////////////////////////// IN DEVELOPMENT /////////////////////////////////
//    @JsonProperty("swagger")
//    var swaggerBundleConfiguration: SwaggerBundleConfiguration? = null

}
