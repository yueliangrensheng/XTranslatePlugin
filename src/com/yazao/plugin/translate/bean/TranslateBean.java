package com.yazao.plugin.translate.bean;

import java.util.List;

public class TranslateBean {

    /**
     * translateResult : [[{"tgt":"China","src":"中国"}]]
     * errorCode : 0
     * type : zh-CHS2en
     * smartResult : {"entries":["","China\r\n"],"type":1}
     */

    private int errorCode;
    private String type;
    private SmartResultBean smartResult;
    private List<List<TranslateResultBean>> translateResult;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SmartResultBean getSmartResult() {
        return smartResult;
    }

    public void setSmartResult(SmartResultBean smartResult) {
        this.smartResult = smartResult;
    }

    public List<List<TranslateResultBean>> getTranslateResult() {
        return translateResult;
    }

    public void setTranslateResult(List<List<TranslateResultBean>> translateResult) {
        this.translateResult = translateResult;
    }

    public static class SmartResultBean {
        /**
         * entries : ["","China\r\n"]
         * type : 1
         */

        private int type;
        private List<String> entries;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getEntries() {
            return entries;
        }

        public void setEntries(List<String> entries) {
            this.entries = entries;
        }
    }

    public static class TranslateResultBean {
        /**
         * tgt : China
         * src : 中国
         */

        private String tgt;
        private String src;

        public String getTgt() {
            return tgt;
        }

        public void setTgt(String tgt) {
            this.tgt = tgt;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }
    }
}
