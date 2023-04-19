package dk.ape;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class MyExtension {

    private static final String FEATURE = "quarkus-extension-gradle-deployment-module-bug";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
