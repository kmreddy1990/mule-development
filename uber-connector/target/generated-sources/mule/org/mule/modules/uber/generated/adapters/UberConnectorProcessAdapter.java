
package org.mule.modules.uber.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.uber.UberConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>UberConnectorProcessAdapter</code> is a wrapper around {@link UberConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-04T12:09:23+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class UberConnectorProcessAdapter
    extends UberConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<UberConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, UberConnectorCapabilitiesAdapter> getProcessTemplate() {
        final UberConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,UberConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, UberConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, UberConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
