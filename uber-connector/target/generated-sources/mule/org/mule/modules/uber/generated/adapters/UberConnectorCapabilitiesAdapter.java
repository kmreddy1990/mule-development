
package org.mule.modules.uber.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.uber.UberConnector;


/**
 * A <code>UberConnectorCapabilitiesAdapter</code> is a wrapper around {@link UberConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-04T12:09:23+05:30", comments = "Build UNNAMED.2793.f49b6c7")
public class UberConnectorCapabilitiesAdapter
    extends UberConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
