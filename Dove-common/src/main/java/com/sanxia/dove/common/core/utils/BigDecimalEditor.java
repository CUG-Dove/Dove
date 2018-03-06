package com.sanxia.dove.common.core.utils;


import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;


/**
 *Description: <br/>
 *Date: 2018-1-29
 *
 * @author Dove
 * */
public class BigDecimalEditor extends PropertyEditorSupport {
    public void setAsText(String text) throws IllegalArgumentException{
        if(text == null || text.isEmpty()){
            setValue(null);
        }else{
            setValue(new BigDecimal(text));
        }

    }
}
