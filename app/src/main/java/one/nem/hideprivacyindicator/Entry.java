package one.nem.hideprivacyindicator;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

public class Entry implements IXposedHookInitPackageResources {
    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam initParam) {
        if (!initParam.packageName.equals("com.android.systemui")) return;

        initParam.res.setReplacement("com.android.systemui", "bool", "config_enablePrivacyDot",false);
    }
}
