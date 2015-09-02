package uk.ac.ebi.pwp.widgets.test;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import uk.ac.ebi.pwp.widgets.gxa.ui.GXAViewer;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WidgetTest implements EntryPoint {
    // IMPORTANT! ATTENTION!
    // Do NOT use the class name for the place holder ( but it is case sensitive :D )
    private static final String PLACE_HOLDER = "widget_test";

    @Override
    public void onModuleLoad() {
        GWT.runAsync(new RunAsyncCallback() {
            public void onFailure(Throwable caught) {
            }

            @SuppressWarnings("unchecked")
            public void onSuccess() {
                GXAViewer gxaViewer = new GXAViewer();
//                gxaViewer.setUniProtIDs(Arrays.asList("O43293","P53355", "Q8IZJ1"));
                gxaViewer.setReactomeID("R-HSA-69580");
                RootPanel.get(PLACE_HOLDER).add(gxaViewer);
            }
        });
    }
}
