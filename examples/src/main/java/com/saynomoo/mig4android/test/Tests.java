package com.saynomoo.mig4android.test;

import com.saynomoo.mig4android.*;

public class Tests extends ActivityListActivity{
    Class[] activities = new Class[]{AbsolutePosition.class, LogicalPixels.class, NonRootMigLayout.class, TextWrap.class, TextWrap2.class, DynamicPreferredSize.class, GrowingListView.class, CanvasTest.class};
    @Override
    public Class[] getActivities() {
        return activities;
    }
}
