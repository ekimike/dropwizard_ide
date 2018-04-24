package pe.caos.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import pe.caos.dropwizard.core.Template;
import pe.caos.dropwizard.resources.HelloWorldResource;

public class RestServiceApplication extends Application<RestServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RestServiceApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<RestServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RestServiceConfiguration c,
                    final Environment e) {
        
        final Template template = c.buildTemplate();
        
        e.jersey().register(new HelloWorldResource(template));
    }

}
