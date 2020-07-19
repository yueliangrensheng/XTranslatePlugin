package com.yazao.plugin.translate.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.yazao.plugin.translate.util.Logger;

public class XTranslateAction extends AnAction {

    private static final String TAG = "yazao";

    @Override
    public void actionPerformed(AnActionEvent e) {

        if (isClickable()) {
            //init logger
            Logger.init(TAG, Logger.DEBUG);
            getActionEvent(e);
        }


    }

    private void getActionEvent(AnActionEvent event) {
        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();

        Logger.debug("selectedText = " + selectedText);
    }

    long lastTimeMillis = 0;

    private boolean isClickable() {
        long currentTimeMillis = System.currentTimeMillis();

        if (currentTimeMillis - lastTimeMillis > 1000) {
            return true;
        }
        lastTimeMillis = currentTimeMillis;
        return false;
    }
}