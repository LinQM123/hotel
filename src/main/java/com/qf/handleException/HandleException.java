package com.qf.handleException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class HandleException {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ModelAndView handlerRuntimeException(Exception e, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");

        modelAndView.addObject("errorMsg", "all:" + e.getMessage());
//        modelMap.addAttribute("errormsg","all:");
        return modelAndView;
    }
}
