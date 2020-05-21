package com.reflection.Reflection_AOP.model;

import java.lang.reflect.Field;

import com.reflection.Reflection_AOP.reflection.NotEmpty;
import com.reflection.Reflection_AOP.reflection.NotNull;

public abstract class ValidateObject  {

	protected String checkNotNull(Field f) {
	        String rtn = "valid";
	        
	        NotNull annotation = f.getAnnotation(NotNull.class);
	        if (null != annotation) {

	            boolean isAccessible = f.isAccessible();
	            f.setAccessible(true);
	            try {
	                if (null == f.get(this)) {
	                    rtn = annotation.error();
	                }
	            } catch (IllegalAccessException e) {
	                System.err.println(" NotNull Annotation Error Message : " + e.getLocalizedMessage());
	                e.printStackTrace();
	            }
	            f.setAccessible(isAccessible);
	        }
	        return rtn;
	    }

	    protected String checkNotEmpty(Field f) {
	        String rtn = "valid";
	        
	        NotEmpty annotation = f.getAnnotation(NotEmpty.class);
	        if (null != annotation) {

	            boolean isAccessible = f.isAccessible();
	            f.setAccessible(true);
	            try {
	                String val = (String) f.get(this);
	                if (null != val && val.isEmpty()) {
	                    rtn = annotation.error();
	                }
	            } catch (IllegalAccessException e) {
	                System.err.println("NotEmpty Error Message : " + e.getLocalizedMessage());
	                e.printStackTrace();
	            }
	            f.setAccessible(isAccessible);
	        }
	        return rtn;
	    }

}
