package org.apache.felix.ipojo.android.felix;

import java.io.InputStream;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import android.content.res.Resources;

public class Installer implements BundleActivator {
    
    public static final String IPOJO_PATH="file:///ipojo.jar";
    private Resources res;
    public Installer(Resources res) {
        this.res = res;
    }
    
    @Override
    public void start(BundleContext arg0) throws Exception {

        InputStream is = res.openRawResource(R.raw.ipojo);
        
        Bundle bundle = arg0.installBundle(IPOJO_PATH, is);
        bundle.start();
    }

    @Override
    public void stop(BundleContext arg0) throws Exception {
        // TODO Auto-generated method stub

    }

}
