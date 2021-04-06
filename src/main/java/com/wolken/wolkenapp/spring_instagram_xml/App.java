package com.wolken.wolkenapp.spring_instagram_xml;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.InstagramBean;
import com.wolken.wolkenapp.bean.MemesBean;
 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	Logger logger = Logger.getLogger(App.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        InstagramBean bean = applicationContext.getBean(InstagramBean.class);
        bean.getMemes();
        logger.info(bean.getInstaId());
        logger.info(bean.getNoOfposts());
       MemesBean bean2 = applicationContext.getBean(MemesBean.class);
      logger.info( bean2.getPageName());
      logger.info(bean2.getNoOfFol());
    logger.info(bean2.getMemeGenre());   
        
    }
}
