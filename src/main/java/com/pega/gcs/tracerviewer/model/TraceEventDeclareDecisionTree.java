/*******************************************************************************
 * Copyright (c) 2017 Pegasystems Inc. All rights reserved.
 *
 * Contributors:
 *     Manu Varghese
 *******************************************************************************/

package com.pega.gcs.tracerviewer.model;

import org.dom4j.Element;

public class TraceEventDeclareDecisionTree extends TraceEventNonActivity {

    public TraceEventDeclareDecisionTree(TraceEventKey traceEventKey, byte[] bytes, Element traceEventElement) {

        super(traceEventKey, bytes, traceEventElement);

        traceEventType = TraceEventType.DECLARE_DECISIONTREE;
    }

    @Override
    protected boolean checkStart() {

        boolean start = false;

        String stepMethod = getStepMethod();

        if ("Begin".equals(stepMethod)) {
            start = true;
        }

        return start;
    }

    @Override
    protected boolean checkEnd() {

        boolean end = false;

        String stepMethod = getStepMethod();

        if ("End".equals(stepMethod)) {
            end = true;
        }

        return end;
    }
}
